package VariableAndDataType

import HelloWorld.Student

object variable {
  def main(args: Array[String]): Unit = {
    // declare a variable
    var a: Int = 10

    // (1) Type Inference
    var b = 10
    val c = 23

    // (2) Strongly Typed
    var d = 15 // the type of d is Int
    //d = "Hello"   // ERROR

    // (3) variable must be initialized when being declared
    //var e: Int    // ERROR

    // (4) engineer is able to use "val" or "val" to declare a variable or constant
    //     var(variable, changeable)    val(constant, unchangeable)
    var f = 10
    val g = 20
    f = 30
    //g = 40    // ERROR

    var alice = new Student("alice", 21)
    alice = new Student("Alice", 21)
    val fe = new Student("fe", 20)
    fe.age = 24
    fe.printInfo()
    //fe = new Student("Fe", 20)    // ERROR
  }
}
