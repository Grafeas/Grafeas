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
import io.grafeas.client.Version;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * This represents a particular channel of distribution for a given package. e.g. Debian&#39;s jessie-backports dpkg mirror
 */
@ApiModel(description = "This represents a particular channel of distribution for a given package. e.g. Debian's jessie-backports dpkg mirror")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-08T14:08:45.411-04:00")
public class Distribution   {
  @SerializedName("cpeUri")
  private String cpeUri = null;

  /**
   * The CPU architecture for which packages in this distribution channel were built
   */
  public enum ArchitectureEnum {
    @SerializedName("UNKNOWN")
    UNKNOWN("UNKNOWN"),
    
    @SerializedName("X86")
    X86("X86"),
    
    @SerializedName("X64")
    X64("X64");

    private String value;

    ArchitectureEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("architecture")
  private ArchitectureEnum architecture = null;

  @SerializedName("latestVersion")
  private Version latestVersion = null;

  @SerializedName("maintainer")
  private String maintainer = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("description")
  private String description = null;

  public Distribution cpeUri(String cpeUri) {
    this.cpeUri = cpeUri;
    return this;
  }

   /**
   * The cpe_uri in [cpe format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
   * @return cpeUri
  **/
  @ApiModelProperty(example = "null", value = "The cpe_uri in [cpe format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.")
  public String getCpeUri() {
    return cpeUri;
  }

  public void setCpeUri(String cpeUri) {
    this.cpeUri = cpeUri;
  }

  public Distribution architecture(ArchitectureEnum architecture) {
    this.architecture = architecture;
    return this;
  }

   /**
   * The CPU architecture for which packages in this distribution channel were built
   * @return architecture
  **/
  @ApiModelProperty(example = "null", value = "The CPU architecture for which packages in this distribution channel were built")
  public ArchitectureEnum getArchitecture() {
    return architecture;
  }

  public void setArchitecture(ArchitectureEnum architecture) {
    this.architecture = architecture;
  }

  public Distribution latestVersion(Version latestVersion) {
    this.latestVersion = latestVersion;
    return this;
  }

   /**
   * The latest available version of this package in this distribution channel.
   * @return latestVersion
  **/
  @ApiModelProperty(example = "null", value = "The latest available version of this package in this distribution channel.")
  public Version getLatestVersion() {
    return latestVersion;
  }

  public void setLatestVersion(Version latestVersion) {
    this.latestVersion = latestVersion;
  }

  public Distribution maintainer(String maintainer) {
    this.maintainer = maintainer;
    return this;
  }

   /**
   * A freeform string denoting the maintainer of this package.
   * @return maintainer
  **/
  @ApiModelProperty(example = "null", value = "A freeform string denoting the maintainer of this package.")
  public String getMaintainer() {
    return maintainer;
  }

  public void setMaintainer(String maintainer) {
    this.maintainer = maintainer;
  }

  public Distribution url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The distribution channel-specific homepage for this package.
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "The distribution channel-specific homepage for this package.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Distribution description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The distribution channel-specific description of this package.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "The distribution channel-specific description of this package.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Distribution distribution = (Distribution) o;
    return Objects.equals(this.cpeUri, distribution.cpeUri) &&
        Objects.equals(this.architecture, distribution.architecture) &&
        Objects.equals(this.latestVersion, distribution.latestVersion) &&
        Objects.equals(this.maintainer, distribution.maintainer) &&
        Objects.equals(this.url, distribution.url) &&
        Objects.equals(this.description, distribution.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpeUri, architecture, latestVersion, maintainer, url, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Distribution {\n");
    
    sb.append("    cpeUri: ").append(toIndentedString(cpeUri)).append("\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
    sb.append("    maintainer: ").append(toIndentedString(maintainer)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

