#!/usr/bin/groovy

package com.askattest

void notifySlack(String message, String color, String channel = "#jenkins-london-demo") {
  slackSend(
      message: message,
      color: color,
      channel: channel,
      teamDomain: "askattest",
      tokenCredentialId: "slack-token"
  )
}
