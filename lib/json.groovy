import groovy.json.JsonOutput
import groovy.json.JsonSlurperClassic

def read(filePath) {
  readJson = readFile(file: filePath)
  data = new JsonSlurperClassic().parseText(readJson)
  return data
}

def write(data, filePath) {
  json = JsonOutput.toJson(data)
  writeFile(file: filePath, text: JsonOutput.prettyPrint(json))
}

def exists(filePath) {
  if(fileExists(filePath)) {
    return true
  } else {
    return false
  }
}
return this