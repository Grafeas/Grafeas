// Copyright 2017 The Grafeas Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// package server is the implementation of a server that handles grafeas requests.
package server

import (
	"encoding/json"
	"fmt"
	"github.com/google/uuid"
	"github.com/grafeas/samples/server/go-server/api"
	"github.com/grafeas/samples/server/go-server/api/server/errors"
	"github.com/grafeas/samples/server/go-server/api/server/name"
	"github.com/grafeas/samples/server/go-server/api/server/v1alpha1"
	"io/ioutil"
	"log"
	"net/http"
	"strings"
)

// Handler accepts httpRequests, converts them to Grafeas objects - calls into Grafeas to operation on them
// and converts responses to http responses.
type Handler struct {
	g v1alpha1.Grafeas
}

// CreateNote handles http requests to create notes in grafeas
func (h *Handler) CreateNote(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "application/json; charset=UTF-8")
	n := swagger.Note{}
	pID, nID, appErr := noteAndProjectIDFromReq(r)
	if appErr != nil {
		http.Error(w, appErr.Err, appErr.StatusCode)
		return
	}

	body, readErr := ioutil.ReadAll(r.Body)
	if readErr != nil {
		log.Printf("Error reading body: %v", readErr)
		http.Error(w, "can't read body", http.StatusBadRequest)
		return
	}

	json.Unmarshal(body, &n)
	genName := name.FormatNote(pID, nID)
	if genName != n.Name {
		log.Printf("Mismatching names in n.Name field and request parameters.")
		http.Error(w, fmt.Sprintf("note.Name %v must specify match with request"+
			" url parameters with projectsId %v and noteID %v", n.Name, pID, nID),
			http.StatusBadRequest)
	}

	if err := h.g.CreateNote(&n); err != nil {
		log.Printf("Error creating note: %v", err)
		http.Error(w, err.Err, err.StatusCode)
	}
	bytes, err := json.Marshal(&n)
	if err != nil {
		log.Printf("Error marshalling bytes: %v", err)
		http.Error(w, "Internal Server Error", http.StatusInternalServerError)
	}
	w.WriteHeader(http.StatusOK)
	w.Write(bytes)
}

func noteAndProjectIDFromReq(r *http.Request) (string, string, *errors.AppError) {
	nIDs, ok := r.URL.Query()["noteId"]
	if !ok {
		log.Print("noteId is not specified")
		return "", "", &errors.AppError{Err: "noteId must be specified in query", StatusCode: http.StatusBadRequest}

	}
	if len(nIDs) != 1 {
		log.Print("noteId is not specified, or multipe noteIds are specified")
		return "", "", &errors.AppError{Err: "Exactly one noteId should be specified in query",
			StatusCode: http.StatusBadRequest}
	}
	nID := nIDs[0]
	k, pID, err := name.ParseResourceKindAndProjectFromPath(strings.Trim(r.URL.Path, "/"))
	if err != nil {
		log.Printf("error parsing path %v", err)
		return "", "", &errors.AppError{Err: "Error processing request",
			StatusCode: http.StatusInternalServerError}
	}
	if k != name.Note {
		log.Printf("wrong object type %v", k)
		return "", "", &errors.AppError{Err: "Error processing request",
			StatusCode: http.StatusInternalServerError}
	}
	return pID, nID, nil
}

// CreateOccurrence handles http requests to create occurrences in grafeas
func (h *Handler) CreateOccurrence(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "application/json; charset=UTF-8")
	o := swagger.Occurrence{}
	body, err := ioutil.ReadAll(r.Body)
	if err != nil {
		log.Printf("Error reading body: %v", err)
		http.Error(w, "can't read body", http.StatusBadRequest)
		return
	}
	k, pID, parseErr := name.ParseResourceKindAndProjectFromPath(strings.Trim(r.URL.Path, "/"))
	if parseErr != nil {
		log.Printf("error parsing path %v", parseErr)
		http.Error(w, "Error processing request", http.StatusInternalServerError)
		return
	}
	if k != name.Occurrence {
		log.Printf("wrong object type %v", k)
		http.Error(w, "Error processing request", http.StatusInternalServerError)
		return
	}

	json.Unmarshal(body, &o)
	// Generate random occurrenceId to prevent collisions
	oID := uuid.New()
	oName := name.FormatOccurrence(pID, oID.String())

	// We replace the name in the specified occurrence with the name generated, as users shouldn't
	// specify an occurrence name.
	o.Name = oName
	if err := h.g.CreateOccurrence(&o); err != nil {
		log.Printf("Error creating occurrence: %v", err)
		http.Error(w, err.Err, err.StatusCode)
	}
	bytes, err := json.Marshal(&o)
	if err != nil {
		log.Printf("Error marshalling bytes: %v", err)
	}
	w.WriteHeader(http.StatusOK)
	w.Write(bytes)
}

// CreateOperation handles http requests to create operation in Grafeas
func (h *Handler) CreateOperation(w http.ResponseWriter, r *http.Request) {
	o := swagger.Operation{}
	body, err := ioutil.ReadAll(r.Body)
	if err != nil {
		log.Printf("Error reading body: %v", err)
		http.Error(w, "can't read body", http.StatusBadRequest)
		return
	}
	json.Unmarshal(body, &o)
	if err := h.g.CreateOperation(&o); err != nil {
		log.Printf("Error creating occurrence: %v", err)
		http.Error(w, err.Err, err.StatusCode)
	}

	w.Header().Set("Content-Type", "application/json; charset=UTF-8")
	w.WriteHeader(http.StatusOK)
	bytes, err := json.Marshal(&o)
	if err != nil {
		log.Printf("Error marshalling bytes: %v", err)
	}
	w.Write(bytes)
	w.Header().Set("Content-Type", "application/json; charset=UTF-8")
	w.WriteHeader(http.StatusOK)
}

func (h *Handler) DeleteNote(w http.ResponseWriter, r *http.Request) {

	w.Header().Set("Content-Type", "application/json; charset=UTF-8")
	pID, nID, appErr := noteAndProjectIDFromReq(r)
	if appErr != nil {
		http.Error(w, appErr.Err, appErr.StatusCode)
		return
	}

	w.WriteHeader(http.StatusOK)
}

func (h *Handler) DeleteOccurrence(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "application/json; charset=UTF-8")
	w.WriteHeader(http.StatusOK)
}

func (h *Handler) GetNote(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "application/json; charset=UTF-8")
	w.WriteHeader(http.StatusOK)
}

func (h *Handler) GetOccurrence(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "application/json; charset=UTF-8")
	w.WriteHeader(http.StatusOK)
}

func (h *Handler) GetOccurrenceNote(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "application/json; charset=UTF-8")
	w.WriteHeader(http.StatusOK)
}

func (h *Handler) ListNoteOccurrences(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "application/json; charset=UTF-8")
	w.WriteHeader(http.StatusOK)
}

func (h *Handler) ListNotes(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "application/json; charset=UTF-8")
	w.WriteHeader(http.StatusOK)
}

func (h *Handler) ListOccurrences(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "application/json; charset=UTF-8")
	w.WriteHeader(http.StatusOK)
}

func (h *Handler) UpdateNote(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "application/json; charset=UTF-8")
	w.WriteHeader(http.StatusOK)
}

func (h *Handler) UpdateOccurrence(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "application/json; charset=UTF-8")
	w.WriteHeader(http.StatusOK)
}

func (h *Handler) UpdateOperation(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "application/json; charset=UTF-8")
	w.WriteHeader(http.StatusOK)
}
