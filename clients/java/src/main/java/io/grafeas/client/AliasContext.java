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
 * An alias to a repo revision.
 */
@ApiModel(description = "An alias to a repo revision.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-08T12:57:49.437-04:00")
public class AliasContext   {
  /**
   * The alias kind.
   */
  public enum KindEnum {
    @SerializedName("ANY")
    ANY("ANY"),
    
    @SerializedName("FIXED")
    FIXED("FIXED"),
    
    @SerializedName("MOVABLE")
    MOVABLE("MOVABLE"),
    
    @SerializedName("OTHER")
    OTHER("OTHER");

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

  @SerializedName("name")
  private String name = null;

  public AliasContext kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

   /**
   * The alias kind.
   * @return kind
  **/
  @ApiModelProperty(example = "null", value = "The alias kind.")
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }

  public AliasContext name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The alias name.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The alias name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AliasContext aliasContext = (AliasContext) o;
    return Objects.equals(this.kind, aliasContext.kind) &&
        Objects.equals(this.name, aliasContext.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AliasContext {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

