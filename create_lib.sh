#!/bin/bash

set -e

mavenGroup=$1
mavenArtifact=$2
mavenVersion=$3
discoveryDocumentUrl=$4

if [[ -z "$mavenGroup" || -z "$mavenArtifact" || -z "$mavenVersion" || -z "$discoveryDocumentUrl" ]]; then
  echo "Parameters: {mavenGroup} {mavenArtifact} {mavenVersion} {discoveryDocumentUrl}"
  echo "See README.md for more details."
  exit 1
fi

echo "mavenGroup:           $mavenGroup"
echo "mavenArtifact:        $mavenArtifact"
echo "mavenVersion:         $mavenVersion"
echo "discoveryDocumentUrl: $discoveryDocumentUrl"

# make folder structure

libraryFolder="libs/${mavenArtifact}"
mkdir -p $libraryFolder

# pull discovery document

echo ""
echo "▶️ Download discovery document..."

curl --silent --output "${libraryFolder}/discoveryDocument.json" --write-out "download status: %{http_code}" --fail "${discoveryDocumentUrl}" || exit 1
echo ""

# generate sources using Docker

echo "▶️ Copy files to make them available in Docker container..."

containerFiles="${libraryFolder}/container_files"
cp -r src/container_files "${containerFiles}"

echo ""
echo "▶️ Setting up Docker container..."

docker run --rm -v "${PWD}/${libraryFolder}:/home/data" python:2 /home/data/container_files/install.sh

echo "▶️ Cleanup files..."

rm -rf "${libraryFolder}/container_files"

echo "▶️ Create build.gradle"

cp src/build.gradle.template "${libraryFolder}/build.gradle"

sed -i "" "s/{mavenGroup}/${mavenGroup}/" "${libraryFolder}/build.gradle"
sed -i "" "s/{mavenArtifact}/${mavenArtifact}/" "${libraryFolder}/build.gradle"
sed -i "" "s/{mavenVersion}/${mavenVersion}/" "${libraryFolder}/build.gradle"

echo "▶️ Add project to settings.gradle"

echo "include ':$mavenArtifact'" >> libs/settings.gradle

echo "▶️ Done."
