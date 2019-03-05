def calc(x: () ⇒ Int): Either[Throwable, Int] = {
  try {
    Right(x()) //An explicit call of the x function
  } catch {
    case b: Throwable ⇒ Left(b)
  }
}

val y = calc { () ⇒ //Having explicitly declaring that Unit is a parameter with ()
  14 + 15
}

def repeatedParameterMethod(x: Int, y: String, z: Any*) = {
  "%d %ss can give you %s".format(x, y, z.mkString(", "))
}

repeatedParameterMethod(3, "egg", List("a delicious sandwich", "protein", "high cholesterol"))

classOf[String].getCanonicalName
classOf[String].getSimpleName