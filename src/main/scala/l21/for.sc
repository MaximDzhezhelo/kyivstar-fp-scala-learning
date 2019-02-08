
val xValues = 1 to 4
val yValues = 1 to 2

val coordinates = for{
  x <- xValues
  myX = 2*x
  y<- yValues
  if(y != 1)
}yield (x, y, myX)

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Future}
import scala.concurrent.duration._

val f1 = Future{
  2 + 2
}

val f2 = Future{
  2 + 4
}

val f3 = for {
  x <- f1
  y <- f2
}yield{
  x + y
}

val result = Await.result(f3, 2.seconds)