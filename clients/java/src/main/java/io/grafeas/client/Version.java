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
 * Version contains structured information about the version of the package. For a discussion of this in Debian/Ubuntu: http://serverfault.com/questions/604541/debian-packages-version-convention For a discussion of this in Redhat/Fedora/Centos: http://blog.jasonantman.com/2014/07/how-yum-and-rpm-compare-versions/
 */
@ApiModel(description = "Version contains structured information about the version of the package. For a discussion of this in Debian/Ubuntu: http://serverfault.com/questions/604541/debian-packages-version-convention For a discussion of this in Redhat/Fedora/Centos: http://blog.jasonantman.com/2014/07/how-yum-and-rpm-compare-versions/")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-08T14:08:45.411-04:00")
public class Version   {
  @SerializedName("epoch")
  private Integer epoch = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("revision")
  private String revision = null;

  /**
   * Distinguish between sentinel MIN/MAX versions and normal versions. If kind is not NORMAL, then the other fields are ignored.
   */
  public enum KindEnum {
    @SerializedName("NORMAL")
    NORMAL("NORMAL"),
    
    @SerializedName("MINIMUM")
    MINIMUM("MINIMUM"),
    
    @SerializedName("MAXIMUM")
    MAXIMUM("MAXIMUM");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("kind")
  private KindEnum kind = null;

  public Version epoch(Integer epoch) {
    this.epoch = epoch;
    return this;
  }

   /**
   * Used to correct mistakes in the version numbering scheme.
   * @return epoch
  **/
  @ApiModelProperty(example = "null", value = "Used to correct mistakes in the version numbering scheme.")
  public Integer getEpoch() {
    return epoch;
  }

  public void setEpoch(Integer epoch) {
    this.epoch = epoch;
  }

  public Version name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The main part of the version name.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The main part of the version name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Version revision(String revision) {
    this.revision = revision;
    return this;
  }

   /**
   * The iteration of the package build from the above version.
   * @return revision
  **/
  @ApiModelProperty(example = "null", value = "The iteration of the package build from the above version.")
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public Version kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Distinguish between sentinel MIN/MAX versions and normal versions. If kind is not NORMAL, then the other fields are ignored.
   * @return kind
  **/
  @ApiModelProperty(example = "null", value = "Distinguish between sentinel MIN/MAX versions and normal versions. If kind is not NORMAL, then the other fields are ignored.")
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Version version = (Version) o;
    return Objects.equals(this.epoch, version.epoch) &&
        Objects.equals(this.name, version.name) &&
        Objects.equals(this.revision, version.revision) &&
        Objects.equals(this.kind, version.kind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(epoch, name, revision, kind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Version {\n");
    
    sb.append("    epoch: ").append(toIndentedString(epoch)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

