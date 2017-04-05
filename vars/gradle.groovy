#!/usr/bin/groovy

def call(String args) {
  String gradleHome = tool "Gradle 2.14.1"
  sh "${gradleHome}/bin/gradle ${args}"
}
