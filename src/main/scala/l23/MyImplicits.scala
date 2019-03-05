package l23

object MyImplicits {

  class IntWrapper(val original: Int) {
    def isOdd = original % 2 != 0
    def isZero = original == 0
  }

  class DoubleWrapper(val original: Double) {
    def toFormatString: String = f"$original%3f"
  }

  implicit def myMethod(value: Int) = new IntWrapper(value)
  implicit def myMethod(value: Double) = new DoubleWrapper(value)

}
