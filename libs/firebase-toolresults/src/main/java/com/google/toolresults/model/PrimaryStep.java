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
 * Stores rollup test status of multiple steps that were run as a group and outcome of each
 * individual step.
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
public final class PrimaryStep extends com.google.api.client.json.GenericJson {

  /**
   * Step Id and outcome of each individual step.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<IndividualOutcome> individualOutcome;

  /**
   * Rollup test status of multiple steps that were run with the same configuration as a group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rollUp;

  /**
   * Step Id and outcome of each individual step.
   * @return value or {@code null} for none
   */
  public java.util.List<IndividualOutcome> getIndividualOutcome() {
    return individualOutcome;
  }

  /**
   * Step Id and outcome of each individual step.
   * @param individualOutcome individualOutcome or {@code null} for none
   */
  public PrimaryStep setIndividualOutcome(java.util.List<IndividualOutcome> individualOutcome) {
    this.individualOutcome = individualOutcome;
    return this;
  }

  /**
   * Rollup test status of multiple steps that were run with the same configuration as a group.
   * @return value or {@code null} for none
   */
  public java.lang.String getRollUp() {
    return rollUp;
  }

  /**
   * Rollup test status of multiple steps that were run with the same configuration as a group.
   * @param rollUp rollUp or {@code null} for none
   */
  public PrimaryStep setRollUp(java.lang.String rollUp) {
    this.rollUp = rollUp;
    return this;
  }

  @Override
  public PrimaryStep set(String fieldName, Object value) {
    return (PrimaryStep) super.set(fieldName, value);
  }

  @Override
  public PrimaryStep clone() {
    return (PrimaryStep) super.clone();
  }

}