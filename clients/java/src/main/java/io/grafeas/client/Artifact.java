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


package java.io.grafeas.client;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Artifact destribes a build product.
 */
@ApiModel(description = "Artifact destribes a build product.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-08T12:57:49.437-04:00")
public class Artifact   {
  @SerializedName("checksum")
  private String checksum = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("names")
  private List<String> names = new ArrayList<String>();

  public Artifact checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

   /**
   * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a container.
   * @return checksum
  **/
  @ApiModelProperty(example = "null", value = "Hash or checksum value of a binary, or Docker Registry 2.0 digest of a container.")
  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  public Artifact id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Artifact ID, if any; for container images, this will be a URL by digest like gcr.io/projectID/imagename@sha256:123456
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Artifact ID, if any; for container images, this will be a URL by digest like gcr.io/projectID/imagename@sha256:123456")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Artifact names(List<String> names) {
    this.names = names;
    return this;
  }

  public Artifact addNamesItem(String namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * Related artifact names. This may be the path to a binary or jar file, or in the case of a container build, the name used to push the container image to Google Container Registry, as presented to `docker push`. Note that a single Artifact ID can have multiple names, for example if two tags are applied to one image.
   * @return names
  **/
  @ApiModelProperty(example = "null", value = "Related artifact names. This may be the path to a binary or jar file, or in the case of a container build, the name used to push the container image to Google Container Registry, as presented to `docker push`. Note that a single Artifact ID can have multiple names, for example if two tags are applied to one image.")
  public List<String> getNames() {
    return names;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Artifact artifact = (Artifact) o;
    return Objects.equals(this.checksum, artifact.checksum) &&
        Objects.equals(this.id, artifact.id) &&
        Objects.equals(this.names, artifact.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checksum, id, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Artifact {\n");
    
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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

