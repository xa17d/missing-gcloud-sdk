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
 * Details for an outcome with a SKIPPED outcome summary.
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
public final class SkippedDetail extends com.google.api.client.json.GenericJson {

  /**
   * If the App doesn't support the specific API level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean incompatibleAppVersion;

  /**
   * If the App doesn't run on the specific architecture, for example, x86.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean incompatibleArchitecture;

  /**
   * If the requested OS version doesn't run on the specific device model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean incompatibleDevice;

  /**
   * If the App doesn't support the specific API level.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncompatibleAppVersion() {
    return incompatibleAppVersion;
  }

  /**
   * If the App doesn't support the specific API level.
   * @param incompatibleAppVersion incompatibleAppVersion or {@code null} for none
   */
  public SkippedDetail setIncompatibleAppVersion(java.lang.Boolean incompatibleAppVersion) {
    this.incompatibleAppVersion = incompatibleAppVersion;
    return this;
  }

  /**
   * If the App doesn't run on the specific architecture, for example, x86.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncompatibleArchitecture() {
    return incompatibleArchitecture;
  }

  /**
   * If the App doesn't run on the specific architecture, for example, x86.
   * @param incompatibleArchitecture incompatibleArchitecture or {@code null} for none
   */
  public SkippedDetail setIncompatibleArchitecture(java.lang.Boolean incompatibleArchitecture) {
    this.incompatibleArchitecture = incompatibleArchitecture;
    return this;
  }

  /**
   * If the requested OS version doesn't run on the specific device model.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncompatibleDevice() {
    return incompatibleDevice;
  }

  /**
   * If the requested OS version doesn't run on the specific device model.
   * @param incompatibleDevice incompatibleDevice or {@code null} for none
   */
  public SkippedDetail setIncompatibleDevice(java.lang.Boolean incompatibleDevice) {
    this.incompatibleDevice = incompatibleDevice;
    return this;
  }

  @Override
  public SkippedDetail set(String fieldName, Object value) {
    return (SkippedDetail) super.set(fieldName, value);
  }

  @Override
  public SkippedDetail clone() {
    return (SkippedDetail) super.clone();
  }

}