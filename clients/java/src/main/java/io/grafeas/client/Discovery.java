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
 * Note that indicates a type of analysis and exists in a provider project to indicate the status of an analysis on a resource. Absence of an occurrence linked to this note for a resource indicates that analysis hasn&#39;t started.
 */
@ApiModel(description = "Note that indicates a type of analysis and exists in a provider project to indicate the status of an analysis on a resource. Absence of an occurrence linked to this note for a resource indicates that analysis hasn't started.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-08T12:57:49.437-04:00")
public class Discovery   {
  /**
   * The kind of analysis that is handled by this discovery.
   */
  public enum AnalysisKindEnum {
    @SerializedName("UNKNOWN")
    UNKNOWN("UNKNOWN"),
    
    @SerializedName("CUSTOM")
    CUSTOM("CUSTOM"),
    
    @SerializedName("PACKAGE_VULNERABILITY")
    PACKAGE_VULNERABILITY("PACKAGE_VULNERABILITY"),
    
    @SerializedName("BUILD_DETAILS")
    BUILD_DETAILS("BUILD_DETAILS"),
    
    @SerializedName("IMAGE_BASIS")
    IMAGE_BASIS("IMAGE_BASIS"),
    
    @SerializedName("PACKAGE_MANAGER")
    PACKAGE_MANAGER("PACKAGE_MANAGER"),
    
    @SerializedName("DEPLOYABLE")
    DEPLOYABLE("DEPLOYABLE"),
    
    @SerializedName("DISCOVERY")
    DISCOVERY("DISCOVERY");

    private String value;

    AnalysisKindEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("analysisKind")
  private AnalysisKindEnum analysisKind = null;

  public Discovery analysisKind(AnalysisKindEnum analysisKind) {
    this.analysisKind = analysisKind;
    return this;
  }

   /**
   * The kind of analysis that is handled by this discovery.
   * @return analysisKind
  **/
  @ApiModelProperty(example = "null", value = "The kind of analysis that is handled by this discovery.")
  public AnalysisKindEnum getAnalysisKind() {
    return analysisKind;
  }

  public void setAnalysisKind(AnalysisKindEnum analysisKind) {
    this.analysisKind = analysisKind;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Discovery discovery = (Discovery) o;
    return Objects.equals(this.analysisKind, discovery.analysisKind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisKind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Discovery {\n");
    
    sb.append("    analysisKind: ").append(toIndentedString(analysisKind)).append("\n");
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

