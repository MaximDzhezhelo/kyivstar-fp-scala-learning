package l02

import java.math.BigInteger

object Example {

  def main(args: Array[String]): Unit = {
    val x = 2 + 2              // final value, init in start, can't override;
    val q: java.lang.String = "Hello wild world" // explicit type indication;
    val big = new BigInteger("12345")
    val b: String = "Hello wild world"
    var y = 2 * 2              // variable value, init in start, can override;
    def z  = 2 + 3         //  definition value, init in execution;
    lazy val a = 2 * 2          // final value, init in execution;

    val fruits = new Array[String](3)
    fruits(0) = "apple, "
    fruits(1) = "orange, "
    fruits(2) = "cherries;"

    val nums_a = Array("one, ", " two, ", "three")
    val nums_b = Array.apply("one, ", " two, ", "three")

    for (fruit <- fruits) print(fruit)
    println()
    println(z)
    println(a)
    println(big)
  }

}
