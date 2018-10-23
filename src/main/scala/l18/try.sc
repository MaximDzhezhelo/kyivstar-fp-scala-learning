import scala.util.{Failure, Success, Try}

val divide = Try {
  1 / 0
}

divide.isFailure
divide.isSuccess

divide match {
  case Success(value) => println(s"result success = $value")
  case Failure(exception) => println(s"result failure = $exception")
}
