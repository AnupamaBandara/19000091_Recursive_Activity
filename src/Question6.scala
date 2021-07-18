//19000091
//Question6

object Question6 {

  def fibonacciSeq(number: Int): Unit = {
    if (number >= 0) {
      fibonacciSeq(number - 1)
      println(fibonacci(number))
    }
  }

  def fibonacci(number: Int): Int = number match {
    case y if y < 2 => y
    case y          => fibonacci(y - 1) + fibonacci(y - 2)
  }

  def main(args: Array[String]): Unit = {
    fibonacciSeq(10)
  }
}
