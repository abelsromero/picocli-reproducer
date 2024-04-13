#!/bin/bash

function build() {
  ./gradlew clean :cli:distTar
  mkdir build
  tar -xvf cli/build/distributions/cli.tar -C build
}

function run() {
  ./build/cli/bin/cli get -f
}
