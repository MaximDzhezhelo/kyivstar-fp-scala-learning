for(x <- 1 to 4) println(s"$x")

for(x <- 1 to 4; y <- 1 to 2) println(s"x = $x y = $y")

for{
    x <- 1 to 4
    y <- 1 to 2
}
  println(s"x = $x y = $y")

for{
  x <- 1 to 4
  if x!=3
  y <- 1 to 2
}
  println(s"x = $x y = $y")

for{
  x <- 1 to 4
  if x!=3
  y <- 1 to 2
  if y == 1
}
  println(s"x = $x y = $y")

for{
  x <- 1 to 4
  if x!=3
  y <- 1 to 2
  z = x * y
}
  println(s"x = $x, y = $y, z = $z")

val array =

  for{
    x <- 1 to 4
    if x!=3
    y <- 1 to 2
    z = x * y
  }
    yield (x,y,z)


(1 to 4 )
  .map(i => i*i)
  .filter(i =>i!= 9) //same (_ != 9)


val xValues = 1 to 4
val yValues = 1 to 2
val coordinates = for {
  x ← xValues
  y ← yValues
} yield (x, y)
coordinates(4)

val nums = List(List(1), List(2), List(3), List(4), List(5))

val result = for {
  numList ← nums
  num ← numList
  if (num % 2 == 0)
} yield (num)