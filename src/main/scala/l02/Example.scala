package l02

object Example {

  def main(args: Array[String]): Unit = {
    val x = 2 + 2              // final value, init in start, can't override;
    var y = 2 * 2              // variable value, init in start, can override;
    def z  = 2 + 3         //  definition value, init in execution
    lazy val a = 2 * 2          // final value, init in execution

    println(z)
    println(a)
  }

}
