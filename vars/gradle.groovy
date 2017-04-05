#!/usr/bin/groovy

def call(String args) {
  String gradleHome = tool "Gradle 3.4.1"
  sh "${gradleHome}/bin/gradle ${args}"
}
