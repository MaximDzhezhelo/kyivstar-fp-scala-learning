val doubleEvents: PartialFunction[Int, Int] ={
  case x if (x % 2) == 0 => x * 2
}

val tripleOdds : PartialFunction[Int, Int] = {
  case x if (x % 2) != 0 => x * 3
}

val whatToDo = doubleEvents orElse tripleOdds

whatToDo(4)