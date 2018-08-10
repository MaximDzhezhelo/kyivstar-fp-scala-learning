package l02

object Example {

  def main(args: Array[String]): Unit = {
    val x = 2 + 2              // final value, init in start, can't override;
    val q: java.lang.String = "Hello wild world" // explicit type indication;
    val b: String = "Hello wild world"
    var y = 2 * 2              // variable value, init in start, can override;
    def z  = 2 + 3         //  definition value, init in execution;
    lazy val a = 2 * 2          // final value, init in execution;

    println(z)
    println(a)
  }

}
