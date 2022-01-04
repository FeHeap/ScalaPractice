package FunctionalProgramming

object Practice {
  def main(args: Array[String]): Unit = {
    // practice 1
    val fun = (i: Int, s: String, c: Char) => {
      if(i == 0 && s == "" && c == '0') false else true
    }
    println(fun(0, "", '0'))
    println(fun(0, "", '1'))
    println(fun(23, "", '0'))
    println(fun(0, "hello", '0'))
    println("=========================")


    // practice 2
    def func1(i: Int): String=>(Char=>Boolean) = {
      def f1(s: String): Char=>Boolean = {
        def f2(c: Char): Boolean = {
          if(i == 0 && s == "" && c == '0') false else true
        }
        f2
      }
      f1
    }

    println(func1(0)("")('0'))
    println(func1(0)("")('1'))
    println(func1(23)("")('0'))
    println(func1(0)("hello")('0'))

    // simplify anonymous function
    def func2(i: Int): String=>(Char=>Boolean) = {
      s => c => if(i == 0 && s == "" && c == '0') false else true
    }

    println(func2(0)("")('0'))
    println(func2(0)("")('1'))
    println(func2(23)("")('0'))
    println(func2(0)("hello")('0'))

    // Currying
    def func3(i: Int)(s: String)(c: Char): Boolean = {
      if(i == 0 && s == "" && c == '0') false else true
    }

    println(func3(0)("")('0'))
    println(func3(0)("")('1'))
    println(func3(23)("")('0'))
    println(func3(0)("hello")('0'))
  }
}
