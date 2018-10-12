val stuff = "blue"

val myStuff = stuff match {
  case "red" ⇒
    println("RED"); 1
  case "blue" ⇒
    println("BLUE"); 2
  case "green" ⇒
    println("GREEN"); 3
  case _ ⇒
    println(stuff); 0 // case _ will trigger if all other cases fail.
}

def goldilocks(expr: Any) = expr match {
      case ("porridge", bear) ⇒
        bear + " said someone's been eating my porridge"
      case ("chair", bear) ⇒ bear + " said someone's been sitting in my chair"
      case ("bed", bear) ⇒ bear + " said someone's been sleeping in my bed"
      case _ ⇒ "what?"
}

goldilocks(("porridge", "Papa"))
goldilocks(("chair", "Mama"))


val g: Int = 31
(g toHexString)

