package FunctionalProgramming

// simplify function
object simplify {
  def main(args: Array[String]): Unit = {
    def f0(name: String): String = {
      return  name
    }
    println(f0("atguigu"))
    println("============================")

    // (1) Omit return, Scala will return the last line
    def f1(name: String): String = {
      name
    }
    println(f1("atguigu"))
    println("============================")

    // (2) Omit {}, if there is only one line in function
    def f2(name: String): String = name
    println(f2("atguigu"))
    println("============================")

    // (3) Omit return type (: type), if the return type is able to be inference
    def f3(name: String) = name
    println(f3("atguigu"))
    println("============================")

    // (4) if there is return, unable to Omit return type (: type)
//    def f4(name: String) = {
//      return  name
//    }   // method f4 has return statement; needs result type
//    println(f4("atguigu"))
    println("============================")

    // (5) if function clearly stated (: Unit), keyword return doesn't work
    def f5(name: String): Unit = {
      return  name
    }
    println(f5("atguigu"))
    println("============================")

    // (6) Omit =, if Scala expects there is no return
    def f6(name: String) {
      println(name)
    }
    println(f6("atguigu"))
    println("============================")

    // (7) able to omit () when call function f, if there is no parameter in function f
    def f7(): Unit = {
      println("atguigu")
    }
    f7()
    f7
    println("============================")

    // (8) Omit (), if there is no parameter (Unable to add () when call)
    def f8: Unit = {
      println("atguigu")
    }
//    f8()    // ERROR
    f8
    println("============================")

    // (9) Omit function name (def), if do not care about it, but logical process
    def f9(name: String): Unit = {
      println("atguigu")
    }
        // anonymous function, lambda expression
    (name: String) => { println(name) }

  }
}
