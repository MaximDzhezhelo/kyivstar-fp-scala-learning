s""
f""
"""\n"""
"""[\.]+?""".r

var i = 0
while (i < 3) {
  println(i)
  i += 1
}

var j = 0
do {
  j += 1
  println(j)
} while (j < 3)

var numbers = Array(1, 2, 3)

for (r <- numbers) {
  println(r)
}

val nums = 1 to 3
for (g <- nums) println(g)

for (g <- 1 to 3) println(g)

for{
  x<- 1 to 4
  y<- 1 to 5

  if x != 2
}println(s"x: $x, y: $y")

for {
  x<- 1 to 10 by 2
}println(s"x: $x")

def fun1() = {
  println(">>>")
}