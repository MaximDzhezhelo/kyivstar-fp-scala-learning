package l13

object AppCalculator {

  def main(args: Array[String]): Unit = {
    args.foreach(println)

    val x = args(0).toInt
    val operation = args(1)
    val y = args(2).toInt
    val result = Calculator.calc(x,y,operation)
    println(result)
  }

}