package VariableAndDataType

import scala.io.StdIn

object stdIn {
  def main(args: Array[String]): Unit = {
    // input
    print("Input your name: ")
    val name:String = StdIn.readLine()
    print("How old are you? ")
    val age: Int = StdIn.readInt()

    // output
    println(s"* Profile *\nname:${name}\nage:${age}\n")
  }
}
