/**
 * Grafeas API
 * An API to insert and retrieve annotations on cloud artifacts.
 *
 * OpenAPI spec version: 0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.grafeas.client;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * StorageSource describes the location of the source in an archive file in Google Cloud Storage.
 */
@ApiModel(description = "StorageSource describes the location of the source in an archive file in Google Cloud Storage.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-08T14:08:45.411-04:00")
public class StorageSource   {
  @SerializedName("bucket")
  private String bucket = null;

  @SerializedName("object")
  private String object = null;

  @SerializedName("generation")
  private String generation = null;

  public StorageSource bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

   /**
   * Google Cloud Storage bucket containing source (see [Bucket Name Requirements] (https://cloud.google.com/storage/docs/bucket-naming#requirements)).
   * @return bucket
  **/
  @ApiModelProperty(example = "null", value = "Google Cloud Storage bucket containing source (see [Bucket Name Requirements] (https://cloud.google.com/storage/docs/bucket-naming#requirements)).")
  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
  }

  public StorageSource object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Google Cloud Storage object containing source.
   * @return object
  **/
  @ApiModelProperty(example = "null", value = "Google Cloud Storage object containing source.")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public StorageSource generation(String generation) {
    this.generation = generation;
    return this;
  }

   /**
   * Google Cloud Storage generation for the object.
   * @return generation
  **/
  @ApiModelProperty(example = "null", value = "Google Cloud Storage generation for the object.")
  public String getGeneration() {
    return generation;
  }

  public void setGeneration(String generation) {
    this.generation = generation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageSource storageSource = (StorageSource) o;
    return Objects.equals(this.bucket, storageSource.bucket) &&
        Objects.equals(this.object, storageSource.object) &&
        Objects.equals(this.generation, storageSource.generation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucket, object, generation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageSource {\n");
    
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

