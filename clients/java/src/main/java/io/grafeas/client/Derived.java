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
import java.io.grafeas.client.Fingerprint;
import java.io.grafeas.client.Layer;
import java.util.ArrayList;
import java.util.List;


/**
 * Derived describes the derived image portion (Occurrence) of the DockerImage relationship.  This image would be produced from a Dockerfile with FROM &lt;DockerImage.Basis in attached Note&gt;.
 */
@ApiModel(description = "Derived describes the derived image portion (Occurrence) of the DockerImage relationship.  This image would be produced from a Dockerfile with FROM <DockerImage.Basis in attached Note>.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-08T12:57:49.437-04:00")
public class Derived   {
  @SerializedName("fingerprint")
  private Fingerprint fingerprint = null;

  @SerializedName("distance")
  private Integer distance = null;

  @SerializedName("layerInfo")
  private List<Layer> layerInfo = new ArrayList<Layer>();

  @SerializedName("baseResourceUrl")
  private String baseResourceUrl = null;

  public Derived fingerprint(Fingerprint fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

   /**
   * The fingerprint of the derived image
   * @return fingerprint
  **/
  @ApiModelProperty(example = "null", value = "The fingerprint of the derived image")
  public Fingerprint getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(Fingerprint fingerprint) {
    this.fingerprint = fingerprint;
  }

  public Derived distance(Integer distance) {
    this.distance = distance;
    return this;
  }

   /**
   * The number of layers by which this image differs from the associated image basis. @OutputOnly
   * @return distance
  **/
  @ApiModelProperty(example = "null", value = "The number of layers by which this image differs from the associated image basis. @OutputOnly")
  public Integer getDistance() {
    return distance;
  }

  public void setDistance(Integer distance) {
    this.distance = distance;
  }

  public Derived layerInfo(List<Layer> layerInfo) {
    this.layerInfo = layerInfo;
    return this;
  }

  public Derived addLayerInfoItem(Layer layerInfoItem) {
    this.layerInfo.add(layerInfoItem);
    return this;
  }

   /**
   * This contains layer-specific metadata, if populated it has length “distance” and is ordered with [distance] being the layer immediately following the base image and [1] being the final layer.
   * @return layerInfo
  **/
  @ApiModelProperty(example = "null", value = "This contains layer-specific metadata, if populated it has length “distance” and is ordered with [distance] being the layer immediately following the base image and [1] being the final layer.")
  public List<Layer> getLayerInfo() {
    return layerInfo;
  }

  public void setLayerInfo(List<Layer> layerInfo) {
    this.layerInfo = layerInfo;
  }

  public Derived baseResourceUrl(String baseResourceUrl) {
    this.baseResourceUrl = baseResourceUrl;
    return this;
  }

   /**
   * This contains the base image url for the derived image Occurrence @OutputOnly
   * @return baseResourceUrl
  **/
  @ApiModelProperty(example = "null", value = "This contains the base image url for the derived image Occurrence @OutputOnly")
  public String getBaseResourceUrl() {
    return baseResourceUrl;
  }

  public void setBaseResourceUrl(String baseResourceUrl) {
    this.baseResourceUrl = baseResourceUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Derived derived = (Derived) o;
    return Objects.equals(this.fingerprint, derived.fingerprint) &&
        Objects.equals(this.distance, derived.distance) &&
        Objects.equals(this.layerInfo, derived.layerInfo) &&
        Objects.equals(this.baseResourceUrl, derived.baseResourceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fingerprint, distance, layerInfo, baseResourceUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Derived {\n");
    
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    layerInfo: ").append(toIndentedString(layerInfo)).append("\n");
    sb.append("    baseResourceUrl: ").append(toIndentedString(baseResourceUrl)).append("\n");
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

