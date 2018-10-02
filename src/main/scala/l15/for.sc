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