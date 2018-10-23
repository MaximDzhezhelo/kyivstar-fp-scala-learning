def parseString(line: String): Either[String, Int] = {
  try {
    Right(line.toInt)
  } catch {
    case e: NumberFormatException => Left("unable to parse: " + e)
  }
}

val maybeInt = parseString("e")

maybeInt match {
  case Right(value) => println(s"Success value is int, value = $value")
  case Left(value) => println(s"Fail value is String, value = $value")
}

val value = maybeInt.fold(
  left => 0,
  right => right
)

value