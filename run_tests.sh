#!/bin/bash -eo pipefail

java -cp app/src/test/java runners.AllTestsRunner

mv junit_results.xml app/build/test-results/test