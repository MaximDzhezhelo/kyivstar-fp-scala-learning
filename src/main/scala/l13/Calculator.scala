package l13

object Calculator {

  def calc(value_a : Int, value_b : Int, operation: String): AnyVal = operation match {
    case "+" => value_a + value_b
    case "-" => value_a - value_b
    case "*" => value_a * value_b
    case "/" => value_a / value_b

    case op => println(s"operation $operation not supportedd")
  }

}