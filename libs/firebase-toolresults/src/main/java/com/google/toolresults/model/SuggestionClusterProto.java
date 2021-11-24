/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * Modify at your own risk.
 */

package com.google.toolresults.model;

/**
 * A set of similar suggestions that we suspect are closely related. This proto and most of the
 * nested protos are branched from foxandcrown.prelaunchreport.service.SuggestionClusterProto,
 * replacing PLR's dependencies with FTL's.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tool Results API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SuggestionClusterProto extends com.google.api.client.json.GenericJson {

  /**
   * Category in which these types of suggestions should appear. Always set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String category;

  /**
   * A sequence of suggestions. All of the suggestions within a cluster must have the same
   * SuggestionPriority and belong to the same SuggestionCategory. Suggestions with the same
   * screenshot URL should be adjacent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SuggestionProto> suggestions;

  /**
   * Category in which these types of suggestions should appear. Always set.
   * @return value or {@code null} for none
   */
  public java.lang.String getCategory() {
    return category;
  }

  /**
   * Category in which these types of suggestions should appear. Always set.
   * @param category category or {@code null} for none
   */
  public SuggestionClusterProto setCategory(java.lang.String category) {
    this.category = category;
    return this;
  }

  /**
   * A sequence of suggestions. All of the suggestions within a cluster must have the same
   * SuggestionPriority and belong to the same SuggestionCategory. Suggestions with the same
   * screenshot URL should be adjacent.
   * @return value or {@code null} for none
   */
  public java.util.List<SuggestionProto> getSuggestions() {
    return suggestions;
  }

  /**
   * A sequence of suggestions. All of the suggestions within a cluster must have the same
   * SuggestionPriority and belong to the same SuggestionCategory. Suggestions with the same
   * screenshot URL should be adjacent.
   * @param suggestions suggestions or {@code null} for none
   */
  public SuggestionClusterProto setSuggestions(java.util.List<SuggestionProto> suggestions) {
    this.suggestions = suggestions;
    return this;
  }

  @Override
  public SuggestionClusterProto set(String fieldName, Object value) {
    return (SuggestionClusterProto) super.set(fieldName, value);
  }

  @Override
  public SuggestionClusterProto clone() {
    return (SuggestionClusterProto) super.clone();
  }

}