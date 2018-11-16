void notifyMessage(channelTag, message) {
  CONSTS = load("../${JOB_NAME}/constant/main.groovy").getAll()
  def (channel, credentialsId) = CONSTS.SLACK.CHANNEL_CREDENTIAL_IDS[channelTag]

  withCredentials([string(credentialsId: credentialsId, variable: 'token')]) {
    slackSend channel: channel, token: token, message: message
  }
}
return this