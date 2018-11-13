package org.slack

void notifyMessage(channel, message) {
  def lib = library('auto-deploy').org.slack
  credentialsId = lib.Constants.CHANNEL_CREDENTIAL_IDS[channel]
  // credentialsId = CONSTS.CHANNEL_CREDENTIAL_IDS[channel]
  withCredentials([string(credentialsId: credentialsId, variable: 'token')]) {
    slackSend channel: channel, token: token, message: message
  }
}

void echoTest(str) {
  echo str
}
return this