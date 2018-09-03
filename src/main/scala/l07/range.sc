val inclusive = 1 to 3

val rangeUntil =  1 until 3

val range = Range(0, 10)

range.size

for(value <- range) println(value)

val someNumbers = Range(2, 10, 3)

for(value <- someNumbers) println(value)


val someNumbers_a = Range(0, 34, 2)
someNumbers_a.contains(33)
someNumbers_a.contains(32)
someNumbers_a.contains(34)

val someNumbers_b = Range(0, 34).inclusive

for(value <- someNumbers_b) println(value)
