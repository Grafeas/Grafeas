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
import java.io.grafeas.client.VulnerabilityLocation;


/**
 * This message wraps a location affected by a vulnerability and its associated fix (if one is available).
 */
@ApiModel(description = "This message wraps a location affected by a vulnerability and its associated fix (if one is available).")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-08T12:57:49.437-04:00")
public class PackageIssue   {
  @SerializedName("affectedLocation")
  private VulnerabilityLocation affectedLocation = null;

  @SerializedName("fixedLocation")
  private VulnerabilityLocation fixedLocation = null;

  @SerializedName("severityName")
  private String severityName = null;

  public PackageIssue affectedLocation(VulnerabilityLocation affectedLocation) {
    this.affectedLocation = affectedLocation;
    return this;
  }

   /**
   * The location of the vulnerability.
   * @return affectedLocation
  **/
  @ApiModelProperty(example = "null", value = "The location of the vulnerability.")
  public VulnerabilityLocation getAffectedLocation() {
    return affectedLocation;
  }

  public void setAffectedLocation(VulnerabilityLocation affectedLocation) {
    this.affectedLocation = affectedLocation;
  }

  public PackageIssue fixedLocation(VulnerabilityLocation fixedLocation) {
    this.fixedLocation = fixedLocation;
    return this;
  }

   /**
   * The location of the available fix for vulnerability.
   * @return fixedLocation
  **/
  @ApiModelProperty(example = "null", value = "The location of the available fix for vulnerability.")
  public VulnerabilityLocation getFixedLocation() {
    return fixedLocation;
  }

  public void setFixedLocation(VulnerabilityLocation fixedLocation) {
    this.fixedLocation = fixedLocation;
  }

  public PackageIssue severityName(String severityName) {
    this.severityName = severityName;
    return this;
  }

   /**
   * The severity (eg: distro assigned severity) for this vulnerability.
   * @return severityName
  **/
  @ApiModelProperty(example = "null", value = "The severity (eg: distro assigned severity) for this vulnerability.")
  public String getSeverityName() {
    return severityName;
  }

  public void setSeverityName(String severityName) {
    this.severityName = severityName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageIssue packageIssue = (PackageIssue) o;
    return Objects.equals(this.affectedLocation, packageIssue.affectedLocation) &&
        Objects.equals(this.fixedLocation, packageIssue.fixedLocation) &&
        Objects.equals(this.severityName, packageIssue.severityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affectedLocation, fixedLocation, severityName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageIssue {\n");
    
    sb.append("    affectedLocation: ").append(toIndentedString(affectedLocation)).append("\n");
    sb.append("    fixedLocation: ").append(toIndentedString(fixedLocation)).append("\n");
    sb.append("    severityName: ").append(toIndentedString(severityName)).append("\n");
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

