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
import java.io.grafeas.client.Artifact;
import java.io.grafeas.client.Command;
import java.io.grafeas.client.Source;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Provenance of a build. Contains all information needed to verify the full details about the build from source to completion.
 */
@ApiModel(description = "Provenance of a build. Contains all information needed to verify the full details about the build from source to completion.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-08T12:57:49.437-04:00")
public class BuildProvenance   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("projectId")
  private String projectId = null;

  @SerializedName("projectNum")
  private String projectNum = null;

  @SerializedName("commands")
  private List<Command> commands = new ArrayList<Command>();

  @SerializedName("builtArtifacts")
  private List<Artifact> builtArtifacts = new ArrayList<Artifact>();

  @SerializedName("createTime")
  private String createTime = null;

  @SerializedName("startTime")
  private String startTime = null;

  @SerializedName("finishTime")
  private String finishTime = null;

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("creator")
  private String creator = null;

  @SerializedName("logsBucket")
  private String logsBucket = null;

  @SerializedName("sourceProvenance")
  private Source sourceProvenance = null;

  @SerializedName("triggerId")
  private String triggerId = null;

  @SerializedName("buildOptions")
  private Map<String, String> buildOptions = new HashMap<String, String>();

  @SerializedName("builderVersion")
  private String builderVersion = null;

  public BuildProvenance id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the build.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Unique identifier of the build.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BuildProvenance projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * ID of the project.
   * @return projectId
  **/
  @ApiModelProperty(example = "null", value = "ID of the project.")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public BuildProvenance projectNum(String projectNum) {
    this.projectNum = projectNum;
    return this;
  }

   /**
   * Numerical ID of the project.
   * @return projectNum
  **/
  @ApiModelProperty(example = "null", value = "Numerical ID of the project.")
  public String getProjectNum() {
    return projectNum;
  }

  public void setProjectNum(String projectNum) {
    this.projectNum = projectNum;
  }

  public BuildProvenance commands(List<Command> commands) {
    this.commands = commands;
    return this;
  }

  public BuildProvenance addCommandsItem(Command commandsItem) {
    this.commands.add(commandsItem);
    return this;
  }

   /**
   * Commands requested by the build.
   * @return commands
  **/
  @ApiModelProperty(example = "null", value = "Commands requested by the build.")
  public List<Command> getCommands() {
    return commands;
  }

  public void setCommands(List<Command> commands) {
    this.commands = commands;
  }

  public BuildProvenance builtArtifacts(List<Artifact> builtArtifacts) {
    this.builtArtifacts = builtArtifacts;
    return this;
  }

  public BuildProvenance addBuiltArtifactsItem(Artifact builtArtifactsItem) {
    this.builtArtifacts.add(builtArtifactsItem);
    return this;
  }

   /**
   * Output of the build.
   * @return builtArtifacts
  **/
  @ApiModelProperty(example = "null", value = "Output of the build.")
  public List<Artifact> getBuiltArtifacts() {
    return builtArtifacts;
  }

  public void setBuiltArtifacts(List<Artifact> builtArtifacts) {
    this.builtArtifacts = builtArtifacts;
  }

  public BuildProvenance createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Time at which the build was created.
   * @return createTime
  **/
  @ApiModelProperty(example = "null", value = "Time at which the build was created.")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public BuildProvenance startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Time at which execution of the build was started.
   * @return startTime
  **/
  @ApiModelProperty(example = "null", value = "Time at which execution of the build was started.")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public BuildProvenance finishTime(String finishTime) {
    this.finishTime = finishTime;
    return this;
  }

   /**
   * Time at whihc execution of the build was finished.
   * @return finishTime
  **/
  @ApiModelProperty(example = "null", value = "Time at whihc execution of the build was finished.")
  public String getFinishTime() {
    return finishTime;
  }

  public void setFinishTime(String finishTime) {
    this.finishTime = finishTime;
  }

  public BuildProvenance userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * GAIA ID of end user who initiated this build; at the time that the BuildProvenance is uploaded to Analysis, this will be resolved to the primary e-mail address of the user and stored in the Creator field.
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "GAIA ID of end user who initiated this build; at the time that the BuildProvenance is uploaded to Analysis, this will be resolved to the primary e-mail address of the user and stored in the Creator field.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public BuildProvenance creator(String creator) {
    this.creator = creator;
    return this;
  }

   /**
   * E-mail address of the user who initiated this build. Note that this was the user's e-mail address at the time the build was initiated; this address may not represent the same end-user for all time.
   * @return creator
  **/
  @ApiModelProperty(example = "null", value = "E-mail address of the user who initiated this build. Note that this was the user's e-mail address at the time the build was initiated; this address may not represent the same end-user for all time.")
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public BuildProvenance logsBucket(String logsBucket) {
    this.logsBucket = logsBucket;
    return this;
  }

   /**
   * Google Cloud Storage bucket where logs were written.
   * @return logsBucket
  **/
  @ApiModelProperty(example = "null", value = "Google Cloud Storage bucket where logs were written.")
  public String getLogsBucket() {
    return logsBucket;
  }

  public void setLogsBucket(String logsBucket) {
    this.logsBucket = logsBucket;
  }

  public BuildProvenance sourceProvenance(Source sourceProvenance) {
    this.sourceProvenance = sourceProvenance;
    return this;
  }

   /**
   * Details of the Source input to the build.
   * @return sourceProvenance
  **/
  @ApiModelProperty(example = "null", value = "Details of the Source input to the build.")
  public Source getSourceProvenance() {
    return sourceProvenance;
  }

  public void setSourceProvenance(Source sourceProvenance) {
    this.sourceProvenance = sourceProvenance;
  }

  public BuildProvenance triggerId(String triggerId) {
    this.triggerId = triggerId;
    return this;
  }

   /**
   * Trigger identifier if the build was triggered automatically; empty if not.
   * @return triggerId
  **/
  @ApiModelProperty(example = "null", value = "Trigger identifier if the build was triggered automatically; empty if not.")
  public String getTriggerId() {
    return triggerId;
  }

  public void setTriggerId(String triggerId) {
    this.triggerId = triggerId;
  }

  public BuildProvenance buildOptions(Map<String, String> buildOptions) {
    this.buildOptions = buildOptions;
    return this;
  }

  public BuildProvenance putBuildOptionsItem(String key, String buildOptionsItem) {
    this.buildOptions.put(key, buildOptionsItem);
    return this;
  }

   /**
   * Special options applied to this build. This is a catch-all field where build providers can enter any desired additional details.
   * @return buildOptions
  **/
  @ApiModelProperty(example = "null", value = "Special options applied to this build. This is a catch-all field where build providers can enter any desired additional details.")
  public Map<String, String> getBuildOptions() {
    return buildOptions;
  }

  public void setBuildOptions(Map<String, String> buildOptions) {
    this.buildOptions = buildOptions;
  }

  public BuildProvenance builderVersion(String builderVersion) {
    this.builderVersion = builderVersion;
    return this;
  }

   /**
   * Version string of the builder at the time this build was executed.
   * @return builderVersion
  **/
  @ApiModelProperty(example = "null", value = "Version string of the builder at the time this build was executed.")
  public String getBuilderVersion() {
    return builderVersion;
  }

  public void setBuilderVersion(String builderVersion) {
    this.builderVersion = builderVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildProvenance buildProvenance = (BuildProvenance) o;
    return Objects.equals(this.id, buildProvenance.id) &&
        Objects.equals(this.projectId, buildProvenance.projectId) &&
        Objects.equals(this.projectNum, buildProvenance.projectNum) &&
        Objects.equals(this.commands, buildProvenance.commands) &&
        Objects.equals(this.builtArtifacts, buildProvenance.builtArtifacts) &&
        Objects.equals(this.createTime, buildProvenance.createTime) &&
        Objects.equals(this.startTime, buildProvenance.startTime) &&
        Objects.equals(this.finishTime, buildProvenance.finishTime) &&
        Objects.equals(this.userId, buildProvenance.userId) &&
        Objects.equals(this.creator, buildProvenance.creator) &&
        Objects.equals(this.logsBucket, buildProvenance.logsBucket) &&
        Objects.equals(this.sourceProvenance, buildProvenance.sourceProvenance) &&
        Objects.equals(this.triggerId, buildProvenance.triggerId) &&
        Objects.equals(this.buildOptions, buildProvenance.buildOptions) &&
        Objects.equals(this.builderVersion, buildProvenance.builderVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, projectId, projectNum, commands, builtArtifacts, createTime, startTime, finishTime, userId, creator, logsBucket, sourceProvenance, triggerId, buildOptions, builderVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildProvenance {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectNum: ").append(toIndentedString(projectNum)).append("\n");
    sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
    sb.append("    builtArtifacts: ").append(toIndentedString(builtArtifacts)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    logsBucket: ").append(toIndentedString(logsBucket)).append("\n");
    sb.append("    sourceProvenance: ").append(toIndentedString(sourceProvenance)).append("\n");
    sb.append("    triggerId: ").append(toIndentedString(triggerId)).append("\n");
    sb.append("    buildOptions: ").append(toIndentedString(buildOptions)).append("\n");
    sb.append("    builderVersion: ").append(toIndentedString(builderVersion)).append("\n");
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

