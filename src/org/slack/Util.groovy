package org.slack

void notifyMessage(channel, message) {
  // def lib = library('auto-deploy').org.slack
  // credentialsId = lib.Constants.CHANNEL_CREDENTIAL_IDS[channel]
  credentialsId = "tmp_ari_slack_token"
  withCredentials([string(credentialsId: credentialsId, variable: 'token')]) {
    slackSend channel: channel, token: token, message: message
  }
}
return this