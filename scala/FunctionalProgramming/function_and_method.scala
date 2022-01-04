package FunctionalProgramming

object function_and_method {
  def main(args: Array[String]): Unit = {
    // define function
    def sayHi(name: String): Unit = {
      println("hi, " + name)
    }

    // call function
    sayHi("alice")

    // call method of object
    function_and_method.sayHi("alice")

    // get return value of method
    val result = function_and_method.sayHello("fe")
    println(result)
  }

  // define method of object
  def sayHi(name: String): Unit = {
    println("Hi, " + name)
  }

  def sayHello(name: String): String = {
    println("Hello, " + name)
    return "Hello"
  }
}
