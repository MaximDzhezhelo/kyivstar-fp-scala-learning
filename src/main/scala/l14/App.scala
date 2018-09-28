package l14

object App {

  def main(args: Array[String]): Unit = {
    val a = Rational(3,4)
    val b = Rational(2,3)

    println(a)
    println(b)

    val c = a * b
    val d = a.*(b)

    println(c)
    println(d)
  }

}
