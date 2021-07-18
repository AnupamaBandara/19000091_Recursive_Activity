//19000091
//Question1

object Question1 {

  def prime(number: Int, y: Int = 2): Boolean = y match {
    case y if y == number        => true
    case y if GCD(number, y) > 1 => false
    case _                    => prime(number, y + 1)
  }

  def GCD(c: Int, d: Int): Int = d match {
    case y if y == 0 => c
    case y if y > c  => GCD(y, c)
    case _           => GCD(d, c % d)
  }

  def main(args: Array[String]): Unit = {
    println(prime(17))
    println(prime(9))
  }
}
