// дерево наследования scala

val number = 20
number.toByte
20.toRadians

class KoanIntWrapper(val original: Int) {
  def isOdd = original % 2 != 0
  def isZero = original == 0
}

implicit def thisMethodNameIsIrrelevant(value: Int) = new KoanIntWrapper(value)

19.isZero
21.isOdd

import java.math.BigInteger
implicit def Int2BigIntegerConvert(value: Int): BigInteger =
  new BigInteger(value.toString)

def add(a: BigInteger, b: BigInteger) = a.add(b)

add(Int2BigIntegerConvert(3), Int2BigIntegerConvert(6)) == Int2BigIntegerConvert(9)

add(3, 6) == 9
add(3, 6) == Int2BigIntegerConvert(9)

add(3, 6) == (9: BigInteger)
add(3, 6).intValue == 9


def howMuchCanIMake_?(hours: Int)(implicit dollarsPerHour: BigDecimal) =
  dollarsPerHour * hours

implicit val hourlyRate = BigDecimal(34)

howMuchCanIMake_?(30)

def howMuchCanIMake_?(hours: Int, amount: BigDecimal = 34, currencyName: String = "Dollars") =
  (amount * hours).toString() + " " + currencyName

howMuchCanIMake_?(30)

howMuchCanIMake_?(30, 95)