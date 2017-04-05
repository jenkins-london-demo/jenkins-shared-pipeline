#!/usr/bin/groovy

def call(Closure body) {
  def utils = new com.askattest.Utils()

  try {
    utils.notifySlack(
      "Build started: <${env.BUILD_URL}console|${env.JOB_NAME} #${env.BUILD_NUMBER}>",
      "good"
    )

    body()

    utils.notifySlack(
      "Build success! <${env.BUILD_URL}console|${env.JOB_NAME} #${env.BUILD_NUMBER}>",
      "good"
    )
  } catch (exception) {
    echo "${exception}"
    utils.notifySlack(
      "Build failed: <${env.BUILD_URL}console|${env.JOB_NAME} #${env.BUILD_NUMBER}>\nCaused by: ${exception.getMessage()}",
      "danger"
    )
    throw exception
  } finally {
    // Do some cleanup, if necessary
  }
}
