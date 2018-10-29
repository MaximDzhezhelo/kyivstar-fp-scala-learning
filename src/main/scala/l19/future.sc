import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Future}
import scala.concurrent.duration._

val f = Future{
  2
}

f.foreach(i => println(i))

val result = Await.result(f, 2 seconds)