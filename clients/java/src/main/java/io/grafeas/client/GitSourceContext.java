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


/**
 * A GitSourceContext denotes a particular revision in a third party Git repository (e.g. GitHub).
 */
@ApiModel(description = "A GitSourceContext denotes a particular revision in a third party Git repository (e.g. GitHub).")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-08T12:57:49.437-04:00")
public class GitSourceContext   {
  @SerializedName("url")
  private String url = null;

  @SerializedName("revisionId")
  private String revisionId = null;

  public GitSourceContext url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Git repository URL.
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "Git repository URL.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public GitSourceContext revisionId(String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

   /**
   * Git commit hash. required.
   * @return revisionId
  **/
  @ApiModelProperty(example = "null", value = "Git commit hash. required.")
  public String getRevisionId() {
    return revisionId;
  }

  public void setRevisionId(String revisionId) {
    this.revisionId = revisionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitSourceContext gitSourceContext = (GitSourceContext) o;
    return Objects.equals(this.url, gitSourceContext.url) &&
        Objects.equals(this.revisionId, gitSourceContext.revisionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, revisionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitSourceContext {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    revisionId: ").append(toIndentedString(revisionId)).append("\n");
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

