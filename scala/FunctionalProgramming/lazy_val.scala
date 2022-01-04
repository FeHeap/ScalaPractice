package FunctionalProgramming

object lazy_val {
  def main(args: Array[String]): Unit = {
    lazy val result: Int = sum(13, 47)

    println("1. call function")
    println("2. result = " + result)
    println("4. result = " + result)
  }

  def sum(a: Int, b: Int): Int = {
    println("3. call sum")
    a + b
  }
}
