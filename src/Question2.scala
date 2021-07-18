//19000091
//Question2

object Question2 {

  def primeSeq(number: Int): Unit = {
    if (number > 2) {
      primeSeq(number - 1)
    }

    if (prime(number)) {
      println(number)
    }
  }

  def prime(number: Int, i: Int = 2): Boolean = i match {
    case y if y == number        => true
    case y if GCD(number, y) > 1 => false
    case _                    => prime(number, i + 1)
  }

  def GCD(c: Int, d: Int): Int = d match {
    case 0          => c
    case y if y > c => GCD(y, c)
    case _          => GCD(d, c % d)
  }

  def main(args: Array[String]): Unit = {
    primeSeq(50)
  }
}
