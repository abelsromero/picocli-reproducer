#!/bin/bash

set -euo pipefail

source "$(dirname "$0")/shared.sh"

build
JAVA_OPTS="-agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=8000" run
