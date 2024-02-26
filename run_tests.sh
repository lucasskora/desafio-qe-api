#!/bin/bash -eo pipefail

java -cp app/build/classes/java/main:app/build/resources/main:app/build/classes/test:app/build/resources/test runners.AllTestsRunner

mv junit_results.xml app/build/test-results/test