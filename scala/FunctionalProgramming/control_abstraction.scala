package FunctionalProgramming

object control_abstraction {
  def main(args: Array[String]): Unit = {
    // 1. call by value
    def f0(a: Int): Unit = {
      println("a: " + a)
      println("a: " + a)
    }
    f0(23)

    def f1(): Int = {
      println("call f1")
      12
    }
    f0(f1())

    // 2. call by name, not pass a specific value but a code block
    def f2(a: =>Int): Unit = {
      println("a: " + a)
      println("a: " + a)
    }
    f2(23)
    f2(f1())
    f2({
      println("This is a code block")
      29
    })
  }
}
