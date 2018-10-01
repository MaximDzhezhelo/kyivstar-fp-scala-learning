package l14

object App {

  def main(args: Array[String]): Unit = {
    val a = Rational(3,4)
    val b = Rational(2,3)

    println("a " + a)
    println("b " + b)

    val c = a * b
    val d = a.*(b)
    val e = a - b
    val g = a + b
    val k = a / b


    println("multiplication " + c)
    println("multiplication " + d)
    println("subtraction " + e)
    println("addition " + g)
    println("division " + k)
  }

}
