//19000091
//Question4

object Question4 {

  def oddEven(number: Int): Unit = {
    if (odd(number)) {
      printf("%d is an Odd Number\n", number);
    } else {
      printf("%d is an Even Number\n", number);
    }
  }

  def even(number: Int): Boolean = number match {
    case 0 => true
    case _ => odd(number - 1)
  }

  def odd(number: Int): Boolean = !even(number)

  def main(args: Array[String]): Unit = {
    oddEven(15)
    oddEven(18)

  }
}
