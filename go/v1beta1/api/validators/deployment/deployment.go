// Copyright 2018 The Grafeas Authors. All rights reserved.
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

// Package deployment implements functions to validate that the fields of deployment entities being
// passed into the API meet our requirements.
package deployment

import (
	"errors"
	"fmt"

	dpb "github.com/grafeas/grafeas/proto/v1beta1/deployment_go_proto"
)

// ValidateDeployable validates that a deployable has all its required fields filled in.
func ValidateDeployable(d *dpb.Deployable) []error {
	errs := []error{}

	if r := d.GetResourceUri(); r == nil {
		errs = append(errs, errors.New("resource_uri is required"))
	} else if len(r) == 0 {
		errs = append(errs, errors.New("resource_uri requires at least 1 element"))
	} else {
		for i, r := range r {
			if r == "" {
				errs = append(errs, fmt.Errorf("resource_uri[%d] cannot be empty", i))
			}
		}
	}

	return errs
}

// ValidateDetails validates that a details has all its required fields filled in.
func ValidateDetails(d *dpb.Details) []error {
	errs := []error{}

	if dp := d.GetDeployment(); dp == nil {
		errs = append(errs, errors.New("deployment is required"))
	} else {
		for _, err := range validateDeployment(dp) {
			errs = append(errs, fmt.Errorf("deployment.%s", err))
		}
	}

	return errs
}

func validateDeployment(d *dpb.Deployment) []error {
	errs := []error{}

	if d.GetDeployTime() == nil {
		errs = append(errs, errors.New("deploy_time is required"))
	}

	return errs
}
