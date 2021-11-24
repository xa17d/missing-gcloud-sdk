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
 * Resource representing a collection of performance samples (or data points)
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
public final class PerfSampleSeries extends com.google.api.client.json.GenericJson {

  /**
   * Basic series represented by a line chart
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BasicPerfSampleSeries basicPerfSampleSeries;

  /**
   * A tool results execution ID. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String executionId;

  /**
   * A tool results history ID. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String historyId;

  /**
   * The cloud project @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * A sample series id @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sampleSeriesId;

  /**
   * A tool results step ID. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stepId;

  /**
   * Basic series represented by a line chart
   * @return value or {@code null} for none
   */
  public BasicPerfSampleSeries getBasicPerfSampleSeries() {
    return basicPerfSampleSeries;
  }

  /**
   * Basic series represented by a line chart
   * @param basicPerfSampleSeries basicPerfSampleSeries or {@code null} for none
   */
  public PerfSampleSeries setBasicPerfSampleSeries(BasicPerfSampleSeries basicPerfSampleSeries) {
    this.basicPerfSampleSeries = basicPerfSampleSeries;
    return this;
  }

  /**
   * A tool results execution ID. @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getExecutionId() {
    return executionId;
  }

  /**
   * A tool results execution ID. @OutputOnly
   * @param executionId executionId or {@code null} for none
   */
  public PerfSampleSeries setExecutionId(java.lang.String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * A tool results history ID. @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getHistoryId() {
    return historyId;
  }

  /**
   * A tool results history ID. @OutputOnly
   * @param historyId historyId or {@code null} for none
   */
  public PerfSampleSeries setHistoryId(java.lang.String historyId) {
    this.historyId = historyId;
    return this;
  }

  /**
   * The cloud project @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * The cloud project @OutputOnly
   * @param projectId projectId or {@code null} for none
   */
  public PerfSampleSeries setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * A sample series id @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getSampleSeriesId() {
    return sampleSeriesId;
  }

  /**
   * A sample series id @OutputOnly
   * @param sampleSeriesId sampleSeriesId or {@code null} for none
   */
  public PerfSampleSeries setSampleSeriesId(java.lang.String sampleSeriesId) {
    this.sampleSeriesId = sampleSeriesId;
    return this;
  }

  /**
   * A tool results step ID. @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getStepId() {
    return stepId;
  }

  /**
   * A tool results step ID. @OutputOnly
   * @param stepId stepId or {@code null} for none
   */
  public PerfSampleSeries setStepId(java.lang.String stepId) {
    this.stepId = stepId;
    return this;
  }

  @Override
  public PerfSampleSeries set(String fieldName, Object value) {
    return (PerfSampleSeries) super.set(fieldName, value);
  }

  @Override
  public PerfSampleSeries clone() {
    return (PerfSampleSeries) super.clone();
  }

}