val someValue: Option[String] = Some("I am wrapped in something")
val emptyValue: Option[String] = None

def maybeItWillReturnSomething(flag: Boolean): Option[String] = {
  if (flag) Some("Found value") else None
}

val value1 = maybeItWillReturnSomething(true)
val value2 = maybeItWillReturnSomething(false)

value1 getOrElse "No value"
value2 getOrElse "No value"
value2 getOrElse {
  "default function"
}


val number: Option[Int] = Some(3)
val noNumber: Option[Int] = None
val result1 = number.map(_ * 1.5)
val result2 = noNumber.map(_ * 1.5)

result1
result2

val number_2: Option[Int] = Some(3)
val noNumber_2: Option[Int] = None
val result1_2 = number_2.fold(1)(_ * 3)
val result2_2 = noNumber_2.fold(1)(_ * 3)

result1_2
result2_2