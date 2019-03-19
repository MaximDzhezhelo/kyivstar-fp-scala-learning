case class MyClass(x : Int)

object MyClass{
  def apply(x: Int): MyClass = new MyClass(x)
  def apply(x: String): MyClass = new MyClass(x.toInt)
}

val c1 = MyClass(2)
val c2 = MyClass("2")

"string" match {
  case MyClass(x) => println(s"val = $x")
  case _ => println("none")
}