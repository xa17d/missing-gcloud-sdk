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
 * Merged test result for environment. If the environment has only one step (no reruns or shards),
 * then the merged result is the same as the step result. If the environment has multiple shards
 * and/or reruns, then the results of shards and reruns that belong to the same environment are
 * merged into one environment result.
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
public final class MergedResult extends com.google.api.client.json.GenericJson {

  /**
   * Outcome of the resource
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Outcome outcome;

  /**
   * State of the resource
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The combined and rolled-up result of each test suite that was run as part of this environment.
   * Combining: When the test cases from a suite are run in different steps (sharding), the results
   * are added back together in one overview. (e.g., if shard1 has 2 failures and shard2 has 1
   * failure than the overview failure_count = 3). Rollup: When test cases from the same suite are
   * run multiple times (flaky), the results are combined (e.g., if testcase1.run1 fails,
   * testcase1.run2 passes, and both testcase2.run1 and testcase2.run2 fail then the overview
   * flaky_count = 1 and failure_count = 1).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TestSuiteOverview> testSuiteOverviews;

  /**
   * Outcome of the resource
   * @return value or {@code null} for none
   */
  public Outcome getOutcome() {
    return outcome;
  }

  /**
   * Outcome of the resource
   * @param outcome outcome or {@code null} for none
   */
  public MergedResult setOutcome(Outcome outcome) {
    this.outcome = outcome;
    return this;
  }

  /**
   * State of the resource
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * State of the resource
   * @param state state or {@code null} for none
   */
  public MergedResult setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * The combined and rolled-up result of each test suite that was run as part of this environment.
   * Combining: When the test cases from a suite are run in different steps (sharding), the results
   * are added back together in one overview. (e.g., if shard1 has 2 failures and shard2 has 1
   * failure than the overview failure_count = 3). Rollup: When test cases from the same suite are
   * run multiple times (flaky), the results are combined (e.g., if testcase1.run1 fails,
   * testcase1.run2 passes, and both testcase2.run1 and testcase2.run2 fail then the overview
   * flaky_count = 1 and failure_count = 1).
   * @return value or {@code null} for none
   */
  public java.util.List<TestSuiteOverview> getTestSuiteOverviews() {
    return testSuiteOverviews;
  }

  /**
   * The combined and rolled-up result of each test suite that was run as part of this environment.
   * Combining: When the test cases from a suite are run in different steps (sharding), the results
   * are added back together in one overview. (e.g., if shard1 has 2 failures and shard2 has 1
   * failure than the overview failure_count = 3). Rollup: When test cases from the same suite are
   * run multiple times (flaky), the results are combined (e.g., if testcase1.run1 fails,
   * testcase1.run2 passes, and both testcase2.run1 and testcase2.run2 fail then the overview
   * flaky_count = 1 and failure_count = 1).
   * @param testSuiteOverviews testSuiteOverviews or {@code null} for none
   */
  public MergedResult setTestSuiteOverviews(java.util.List<TestSuiteOverview> testSuiteOverviews) {
    this.testSuiteOverviews = testSuiteOverviews;
    return this;
  }

  @Override
  public MergedResult set(String fieldName, Object value) {
    return (MergedResult) super.set(fieldName, value);
  }

  @Override
  public MergedResult clone() {
    return (MergedResult) super.clone();
  }

}