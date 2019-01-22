1 + 1

def z = {
  println("Perform")
  2
}

val x = 2 + 5.2 + z

def f1() = {
  var g = 1 + 1
  g += 3
  g = g - 27
  g = g + 100 * 3
  g
}

println(f1)
println(f1())

def f2(x: Int) = x * 3
println(f2(3))

def f3(x: => Int) = x + 3

def max(x: Int, y: Int): Int ={
  if(x > y) x
  else y
}

println(max(3,5))

def min(z: Int, q: Int): Int= {
  if(z < q)  q
  else z
}

31 toHexString