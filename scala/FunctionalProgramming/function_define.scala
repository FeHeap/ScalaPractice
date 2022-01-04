package FunctionalProgramming

object function_define {
  def main(args: Array[String]): Unit = {
    // (1) function 1: no parameter, no return
    def f1(): Unit = {
      println("1. no parameter, no return")
    }
    f1()
    println(f1())
    println("=======================")

    // (2) function 2: no parameter, return
    def f2(): Int = {
      println("2. no parameter, return")
      return  12
    }
    println(f2())
    println("=======================")

    // (3) function 3: 1 parameter, no return
    def f3(name: String): Unit = {
      println("3. parameter, no return " + name)
    }
    println(f3("alice"))
    println("=======================")

    // (4) function 4: 1 parameter, return
    def f4(name: String): String = {
      println("4. parameter, return " + name)
      return "hi, " + name
    }
    println(f4("alice"))
    println("=======================")

    // (5) function 5: n parameter, no return
    def f5(name1: String, name2: String): Unit = {
      println("5. n parameter, no return ")
      println(s"${name1} and ${name2} are my friends.")
    }
    println(f5("luder", "andy"))
    println("=======================")

    // (6) function 6: n parameter, return
    def f6(a: Int, b: Int): Int = {
      println("6. n parameter, return ")
      return a + b
    }
    println(f6(12, 37))
  }
}
