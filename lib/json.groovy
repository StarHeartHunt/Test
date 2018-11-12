import groovy.json.JsonOutput
import groovy.json.JsonSlurperClassic

Map read(filePath) {
  readJson = readFile(file: filePath)
  data = new JsonSlurperClassic().parseText(readJson)
  return data
}

void write(data, filePath) {
  json = JsonOutput.toJson(data)
  writeFile(file: filePath, text: JsonOutput.prettyPrint(json))
}

return this