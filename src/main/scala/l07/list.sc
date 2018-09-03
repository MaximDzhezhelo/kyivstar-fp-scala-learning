//val list_a = List[Int]
val list_b = List(1, 2, 3, 4, 5)
list_b.headOption

val a_x = List(1, 2, 3)

a_x.map {_ * 2}

val list_c = Nil

list_b.head
list_b.last

list_b.tail
list_b.init

// правоасоциативные операторы
2 :: list_b

val with_41 = 41 :: list_b
val with_2 = 2 :: with_41

val tail = with_2.tail

val length = with_2.length

val ints = list_c ::: with_2

val values = 24 :: 25 :: 26 :: 27 :: Nil

val valuesReverse = values.reverse

val value = valuesReverse(2)

val valuesDrop = valuesReverse.drop(2)

list_c.isEmpty

val last = list_b.last

val a = List(1, 2, 3)
val b = List(1, 2, 3)

a eq b
a == b

val a_c = List(1, 3, 5, 7)
a_c.reduceLeft(_ + _)
a_c.reduceRight(_ * _)
a_c.foldLeft(0)(_ + _)
a_c.foldLeft(10)(_ + _)