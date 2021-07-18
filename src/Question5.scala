//19000091
//Question5

object Question5 {

  def addEven(number: Int): Int = {
    if (number < 2) {
      0
    } else {
      if (!odd(number)) {
        number + addEven(number - 1)
      } else {
        addEven(number - 1)
      }
    }
  }

  def even(number: Int): Boolean = number match {
    case 0 => true
    case _ => odd(number - 1)
  }

  def odd(number: Int): Boolean = !even(number)

  def main(args: Array[String]): Unit = {
    println(addEven(20))
  }
}
