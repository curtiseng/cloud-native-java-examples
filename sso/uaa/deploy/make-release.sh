#!/usr/bin/env bash

# This script creates a new release by:
# - 1. building/pushing images.
# - 2. injecting tags into YAML manifests.
# - 3. creating a new git tag.
# - 4. pushing the tag/commit to master.