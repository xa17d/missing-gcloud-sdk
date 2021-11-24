#!/bin/bash

set -e

libraryName=$1
libraryVersion=$2
discoveryDocumentUrl=$3

if [[ -z "$libraryName" || -z "$libraryVersion" || -z "$discoveryDocumentUrl" ]]; then
  echo "Parameters: libraryName libraryVersion discoveryDocumentUrl"
  echo "See README.md for more details."
  exit 1
fi

echo "libraryName:          $libraryName"
echo "libraryVersion:       $libraryVersion"
echo "discoveryDocumentUrl: $discoveryDocumentUrl"

# make folder structure

artifactName="${libraryName}-${libraryVersion}"
libraryFolder="libs/${artifactName}"
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

sed -i "" "s/{artifactName}/${artifactName}/" "${libraryFolder}/build.gradle"

echo "▶️ Add project to settings.gradle"

echo "include ':$libraryName-$libraryVersion'" >> libs/settings.gradle

echo "▶️ Done."