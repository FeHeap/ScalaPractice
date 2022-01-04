package FunctionalProgramming

object closure_and_currying {
  def main(args: Array[String]): Unit = {
    def add(a: Int, b: Int): Int = {
      a + b
    }

    // 1. consider a situation, a fixed addend
    def addByFour(b: Int): Int = {
      4 + b
    }

    // 2. consider a situation, the fixed addend changes
    def addByFive(b: Int): Int = {
      5 + b
    }

    // 3. pass the fixed addend as another parameter (the first layer parameter)
    def addByFour1(): Int=>Int = {
      val a = 4
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }

    def addByA(a: Int): Int=>Int = {
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }

    println(addByA(35)(24))

    val addByFour2 = addByA(4)
    val addByFive2 = addByA(5)
    println(addByFour2(13))
    println(addByFive2(25))

    // 4. simplify as lambda
    def addByA1(a: Int): Int=>Int = {
      (b: Int) => {
        a + b
      }
    }

    def addByA2(a: Int): Int=>Int = {
      b => a + b
    }

    def addByA3(a: Int): Int=>Int = a + _

    val addByFour3 = addByA3(4)
    val addByFive3 = addByA3(5)
    println(addByFour3(13))
    println(addByFive3(25))

    // 5. currying
    def addCurrying(a: Int)(b: Int): Int = {
      a + b
    }
    println(addCurrying(35)(24))
  }
}
