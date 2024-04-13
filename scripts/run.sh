#!/bin/bash

set -euo pipefail

source "$(dirname "$0")/shared.sh"

build
run
