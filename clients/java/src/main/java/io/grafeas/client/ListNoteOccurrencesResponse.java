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
import io.grafeas.client.Occurrence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Response including listed occurrences for a note.
 */
@ApiModel(description = "Response including listed occurrences for a note.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-08T14:08:45.411-04:00")
public class ListNoteOccurrencesResponse   {
  @SerializedName("occurrences")
  private List<Occurrence> occurrences = new ArrayList<Occurrence>();

  @SerializedName("nextPageToken")
  private String nextPageToken = null;

  public ListNoteOccurrencesResponse occurrences(List<Occurrence> occurrences) {
    this.occurrences = occurrences;
    return this;
  }

  public ListNoteOccurrencesResponse addOccurrencesItem(Occurrence occurrencesItem) {
    this.occurrences.add(occurrencesItem);
    return this;
  }

   /**
   * The occurrences attached to the specified note.
   * @return occurrences
  **/
  @ApiModelProperty(example = "null", value = "The occurrences attached to the specified note.")
  public List<Occurrence> getOccurrences() {
    return occurrences;
  }

  public void setOccurrences(List<Occurrence> occurrences) {
    this.occurrences = occurrences;
  }

  public ListNoteOccurrencesResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * Token to receive the next page of notes.
   * @return nextPageToken
  **/
  @ApiModelProperty(example = "null", value = "Token to receive the next page of notes.")
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListNoteOccurrencesResponse listNoteOccurrencesResponse = (ListNoteOccurrencesResponse) o;
    return Objects.equals(this.occurrences, listNoteOccurrencesResponse.occurrences) &&
        Objects.equals(this.nextPageToken, listNoteOccurrencesResponse.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(occurrences, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListNoteOccurrencesResponse {\n");
    
    sb.append("    occurrences: ").append(toIndentedString(occurrences)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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

