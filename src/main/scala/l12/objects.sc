case class Session(hosts: String, user: String, pass: String) {
  def execute(sql: String): String = s"$sql was executed"
}

object Session {   // companionObject
  def validate(sql: String): Boolean = !sql.isEmpty
}


object DB {
  private val hosts = "127.0.0.1:9842, 127.0.0.1:9043"
  private val user = "user"
  private val pass = "pass"

  def connect(): Session = Session(hosts, user, pass)
}

DB.connect().execute("SELECT * FROM my.users")