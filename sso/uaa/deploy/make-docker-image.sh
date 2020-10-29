#!/usr/bin/env bash

cd ../

TAG="${TAG:?TAG env variable must be specified}"

docker build -t uaa:v${TAG} .

echo "Successfully built and pushed all images."