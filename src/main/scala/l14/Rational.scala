package l14

case class Rational (n: Int, d: Int) { // n - numer (числитель), d -denom - знаменатель

  require(d != 0)

  val g = gcd(n.abs, d.abs)
  val numer = n/g
  val denom = d/g

  def * (that: Rational) = Rational(numer * that.n, denom * that.d)

  def + (that: Rational) = Rational(numer * that.denom + that.numer * denom, denom * that.denom)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  override def toString = s"$numer/$denom"

}
