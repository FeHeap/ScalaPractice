package FunctionalProgramming

object high_order_function {
  def main(args: Array[String]): Unit = {
    def f(n: Int): Int = {
      println("call f")
      n + 1
    }
    def fun(): Int = {
      println("call fun")
      1
    }

    val result: Int = f(123)
    println(result)


    // 1. pass function as value
    val f1: Int=>Int = f
    val f2 = f _

    println(f1)
    println(f1(12))
    println(f2)
    println(f2(55))

    val f3: ()=>Int = fun
    val f4 = fun _
    println(f3)
    println(f4)


    // 2. pass function as parameter
    def dualEval(op: (Int, Int)=>Int, a: Int, b: Int): Int = {
      op(a, b)
    }

    def add(a: Int, b: Int): Int = {
      a + b
    }

    println(dualEval(add, 12, 35))
    println(dualEval((a, b) => a + b, 12, 35))
    println(dualEval(_ + _, 12, 35))


    // 3. pass function as function return
    def f5(): Int=>Unit = {
      def f6(a: Int): Unit = {
        println("call f6 " + a)
      }
      f6
    }
    println(f5())
    val f6 = f5()
    println(f6)
    println(f6(25))
    println(f5()(25))
  }
}
