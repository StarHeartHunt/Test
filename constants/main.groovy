class SLACK {
  // Slackのチャンネルと認証IDの紐づけ情報
  static final CHANNEL_CREDENTIAL_IDS = [
    "#hooktest": "approval_slack_token",
  ]
}

echo SLACK.CHANNEL_CREDENTIAL_IDS["#hooktest"]
return this