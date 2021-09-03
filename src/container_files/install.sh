#!/bin/bash

# This is meant to be run inside the Python2-Docker Container (see `create_lib.sh`)

pip install google-apis-client-generator

echo "▶️ Generating library..."
cd /home/data

mkdir -p src/main/java
generate_library --input=discoveryDocument.json --language=java --output_dir=src/main/java