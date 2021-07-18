//19000091
//Question3

object Question3 {

  def sum(number: Int): Int = {
    if (number == 1) {
      1
    } else {
      number + sum(number - 1)
    }
  }

  def main(args: Array[String]): Unit = {
    println(sum(10))
  }
}
