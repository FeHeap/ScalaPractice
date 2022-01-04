package FunctionalProgramming

object function_parameter {
  def main(args: Array[String]): Unit = {
    // (1) x parameters (x is variable)
    def f1(str: String*): Unit = {
      println(str)
    }
    f1("alice")
    f1("aaa", "bbb", "ccc")

    // (2) if there are multi-parameter, x parameters (x is variable) put at last
    def f2(str1: String, str2: String*): Unit = {
      println("str1: " + str1 + ", str2: " + str2)
    }
    f2("alice")
    f2("aaa", "bbb", "ccc")

    // (3) default value of parameter, put at last
    def f3(name: String = "atguigu"): Unit = {
      println("My school is " + name)
    }
    f3("NCHU")
    f3()

    // (4) name of parameter
    def f4(name: String = "fe", age: Int): Unit = {
      println(s"${age} years old, ${name} studies in atguigu")
    }
    f4("alice", 20)
    f4(age = 21, name = "luder")
    f4(age = 20)
  }
}
