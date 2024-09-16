package adapter.fp

typealias JsonLogger = (String) -> Unit
typealias XmlLogger = (String) -> Unit

val jsonLogger: JsonLogger = { jsonMessage ->
    println(jsonMessage)
}

val xmlLogger: XmlLogger = { xmlMessage ->
    println("<message>$xmlMessage</message>")
}


fun xmlLoggerAdapter(xmlLogger: XmlLogger): JsonLogger = { message ->
    xmlLogger(message)
}

fun makeExternalApiRequest(logger: JsonLogger) {
    val response = "success response"
    val code = 200
    logger("response: $response, status code: $code")
}