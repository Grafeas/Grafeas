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
import java.io.grafeas.client.AliasContext;


/**
 * A SourceContext referring to a Gerrit project.
 */
@ApiModel(description = "A SourceContext referring to a Gerrit project.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-08T12:57:49.437-04:00")
public class GerritSourceContext   {
  @SerializedName("hostUri")
  private String hostUri = null;

  @SerializedName("gerritProject")
  private String gerritProject = null;

  @SerializedName("revisionId")
  private String revisionId = null;

  @SerializedName("aliasName")
  private String aliasName = null;

  @SerializedName("aliasContext")
  private AliasContext aliasContext = null;

  public GerritSourceContext hostUri(String hostUri) {
    this.hostUri = hostUri;
    return this;
  }

   /**
   * The URI of a running Gerrit instance.
   * @return hostUri
  **/
  @ApiModelProperty(example = "null", value = "The URI of a running Gerrit instance.")
  public String getHostUri() {
    return hostUri;
  }

  public void setHostUri(String hostUri) {
    this.hostUri = hostUri;
  }

  public GerritSourceContext gerritProject(String gerritProject) {
    this.gerritProject = gerritProject;
    return this;
  }

   /**
   * The full project name within the host. Projects may be nested, so \"project/subproject\" is a valid project name. The \"repo name\" is hostURI/project.
   * @return gerritProject
  **/
  @ApiModelProperty(example = "null", value = "The full project name within the host. Projects may be nested, so \"project/subproject\" is a valid project name. The \"repo name\" is hostURI/project.")
  public String getGerritProject() {
    return gerritProject;
  }

  public void setGerritProject(String gerritProject) {
    this.gerritProject = gerritProject;
  }

  public GerritSourceContext revisionId(String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

   /**
   * A revision (commit) ID.
   * @return revisionId
  **/
  @ApiModelProperty(example = "null", value = "A revision (commit) ID.")
  public String getRevisionId() {
    return revisionId;
  }

  public void setRevisionId(String revisionId) {
    this.revisionId = revisionId;
  }

  public GerritSourceContext aliasName(String aliasName) {
    this.aliasName = aliasName;
    return this;
  }

   /**
   * The name of an alias (branch, tag, etc.).
   * @return aliasName
  **/
  @ApiModelProperty(example = "null", value = "The name of an alias (branch, tag, etc.).")
  public String getAliasName() {
    return aliasName;
  }

  public void setAliasName(String aliasName) {
    this.aliasName = aliasName;
  }

  public GerritSourceContext aliasContext(AliasContext aliasContext) {
    this.aliasContext = aliasContext;
    return this;
  }

   /**
   * An alias, which may be a branch or tag.
   * @return aliasContext
  **/
  @ApiModelProperty(example = "null", value = "An alias, which may be a branch or tag.")
  public AliasContext getAliasContext() {
    return aliasContext;
  }

  public void setAliasContext(AliasContext aliasContext) {
    this.aliasContext = aliasContext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GerritSourceContext gerritSourceContext = (GerritSourceContext) o;
    return Objects.equals(this.hostUri, gerritSourceContext.hostUri) &&
        Objects.equals(this.gerritProject, gerritSourceContext.gerritProject) &&
        Objects.equals(this.revisionId, gerritSourceContext.revisionId) &&
        Objects.equals(this.aliasName, gerritSourceContext.aliasName) &&
        Objects.equals(this.aliasContext, gerritSourceContext.aliasContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostUri, gerritProject, revisionId, aliasName, aliasContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GerritSourceContext {\n");
    
    sb.append("    hostUri: ").append(toIndentedString(hostUri)).append("\n");
    sb.append("    gerritProject: ").append(toIndentedString(gerritProject)).append("\n");
    sb.append("    revisionId: ").append(toIndentedString(revisionId)).append("\n");
    sb.append("    aliasName: ").append(toIndentedString(aliasName)).append("\n");
    sb.append("    aliasContext: ").append(toIndentedString(aliasContext)).append("\n");
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

