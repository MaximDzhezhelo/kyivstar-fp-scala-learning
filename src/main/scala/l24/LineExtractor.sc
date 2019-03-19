import java.util.UUID

case class Line(id : UUID, name: String, price: Double){

  private val pattern =  """[a-fA-F0-9]"""

    def this(line: String) = this()

}

val source = Array(
  "656a4cd6-21cd-4be2-b06b-f797e77549a4; Mouse 103; 200.00",
  "656a4cd6-21cd-4be2-b06b-f797e77549a4; Mouse 108; 300.00"
)

val lines = source map Line