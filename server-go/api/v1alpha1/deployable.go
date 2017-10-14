/*
 * Grafeas API
 *
 * An API to insert and retrieve annotations on cloud artifacts.
 *
 * OpenAPI spec version: 0.1
 *
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

package api

// An artifact that can be deployed in some runtime.
type Deployable struct {

	// Resource URI for the artifact being deployed.
	ResourceUri []string `json:"resourceUri,omitempty"`
}
