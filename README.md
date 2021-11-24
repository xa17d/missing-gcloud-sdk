# missing-gcloud-sdk

Google provides Java SDKs for a majority of its services. But some are missing (e.g. Firebase Test Labs).
This repository provides helper libraries for some missing services.

**Disclaimer: This is NOT a Google product!**

Google provides a tool called [apis-client-generator](https://github.com/google/apis-client-generator).
This is what's used to generate the libraries.

## Generate New Libraries

_Prerequisites:_ Unix shell, Docker, Java (>11)

**1. Discovery Document**

For the library to be generated, you need a _"Discovery document"_.
This is provided by the official REST API Reference (e.g. [Cloud Testing API](https://firebase.google.com/docs/test-lab/reference/testing/rest)). The link looks like this:
```
https://testing.googleapis.com/$discovery/rest?version=v1
```

**2. Generate Script**

Call `./create_lib.sh {mavenGroup} {mavenArtifact} {mavenVersion} {discoveryDocumentUrl}`.

 `{mavenGroup} {mavenArtifact} {mavenVersion}` are used in the generated gradle configuration, and can be used to include those libraries via maven in other projects.

Examples:
```bash
./create_lib.sh at.xa1.missing-gcloud-sdk firebase-testing 1 https://testing.googleapis.com/\$discovery/rest\?version\=v1
./create_lib.sh at.xa1.missing-gcloud-sdk firebase-toolresults 1beta3 https://toolresults.googleapis.com/\$discovery/rest\?version\=v1beta3
```
_(Note: Don't forget to escape `$` contained in the URL)_

**3. Build JAR**

```bash
cd libs
./gradlew build
```

Optionally, you can publish the libraries to maven local:
```bash
./gradlew publishToMavenLocal
```

## Integrate in Code

Add dependencies:
``` groovy
implementation "com.google.api-client:google-api-client:1.32.2"
implementation "at.xa1.missing-gcloud-sdk:firebase-testing:1" // <-- this is the generated library, 
                                                              //     deployed to maven local
implementation "at.xa1.missing-gcloud-sdk:firebase-toolresults:1beta3"
…
```

```kotlin
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
import com.google.api.client.googleapis.util.Utils
import com.google.api.client.http.HttpRequest
import com.google.api.client.http.HttpRequestInitializer
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.json.JsonFactory
import com.google.auth.Credentials
import com.google.auth.http.HttpCredentialsAdapter
import com.google.auth.oauth2.GoogleCredentials
import com.google.auth.oauth2.ServiceAccountCredentials
import com.google.testing.Testing

…

// Initialize with default credentials.
// Make sure the environment variable `GOOGLE_APPLICATION_CREDENTIALS`
// is set to the file containing the service account credentials, e.g.:
// ```
// GOOGLE_APPLICATION_CREDENTIALS=/Users/xa17d/example/google-service-account.json
// ```
val httpTransport: NetHttpTransport = GoogleNetHttpTransport.newTrustedTransport()
val jsonFactory: JsonFactory = Utils.getDefaultJsonFactory()
val credentials: GoogleCredentials = ServiceAccountCredentials.getApplicationDefault()

// https://developers.google.com/identity/protocols/googlescopes
// https://developers.google.com/identity/protocols/application-default-credentials
// https://cloud.google.com/sdk/gcloud/reference/alpha/compute/instances/set-scopes
val scopedCredentials = credentials.createScoped(listOf("https://www.googleapis.com/auth/cloud-platform"))

// Extended Timeout might be helpful:
val httpCredential: HttpRequestInitializer =
    HttpCredentialsAndTimeoutAdapter(scopedCredentials, timeoutMillis = 60_000)

// Initialize missing-gcloud-sdk:
val testing = Testing.Builder(httpTransport, jsonFactory, httpCredential)
    .setApplicationName("ExampleApp")
    .build()

// Execute a commend:
val result = testing.testEnvironmentCatalog().get("ANDROID").execute()
println(result.toPrettyString())
```

Helper `HttpRequestInitializer` (inspired by [Flank](https://github.com/Flank/flank)):
```kotlin
class HttpCredentialsAndTimeoutAdapter(
    credentials: Credentials,
    private val timeoutMillis: Int
) : HttpCredentialsAdapter(credentials) {
    override fun initialize(request: HttpRequest?) {
        super.initialize(request)

        request?.connectTimeout = timeoutMillis
        request?.readTimeout = timeoutMillis
    }
}
```

## Generated Libraries

The generated library code is added on [libraries branch](https://github.com/xa17d/missing-gcloud-sdk/tree/libraries/libs).
Compiled JAR files are added to the [Releases](https://github.com/xa17d/missing-gcloud-sdk/releases) page.

| API | Version | Source |
| --- | ------- | ------ |
| testing | v1 | Cloud Testing API<br>https://firebase.google.com/docs/test-lab/reference/testing/rest<br>https://testing.googleapis.com/$discovery/rest?version=v1 |
| toolresults | v1beta3 | Cloud Tool Results API<br>https://firebase.google.com/docs/test-lab/reference/toolresults/rest<br>https://toolresults.googleapis.com/$discovery/rest?version=v1beta3 |
