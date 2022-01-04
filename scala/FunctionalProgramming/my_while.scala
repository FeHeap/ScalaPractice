package FunctionalProgramming

import java.util.concurrent.locks.Condition

object my_while {
  def main(args: Array[String]): Unit = {
    var n = 10

    // 1. common while loop
    while(n >= 1) {
      println(n)
      n -= 1
    }
    println("============")


    // 2. implement a function by closure, pass the code block as parameter, tail recursion
    def myWhile(condition: =>Boolean): (=>Unit)=>Unit = {
      // internal function will use tail recursion, parameter is the body of loop
      def doLoop(op: => Unit): Unit = {
        if(condition) {
          op
          doLoop(op)
        }
      }
      doLoop _
    }

    n = 10
    myWhile(n >= 1) {
      println(n)
      n -= 1
    }
    println("============")

    // 3. implement by anonymous function
    def myWhile1(condition: =>Boolean): (=>Unit)=>Unit = {
      // internal function will use recursion, parameter is the body of loop
      op => {
        if(condition) {
          op
          myWhile1(condition)(op)
        }
      }
    }

    n = 10
    myWhile1(n >= 1) {
      println(n)
      n -= 1
    }
    println("============")

    // 4. implement currying
    def myWhile2(condition: =>Boolean)(op: =>Unit): Unit = {
      if(condition) {
        op
        myWhile2(condition)(op)
      }
    }

    n = 10
    myWhile2(n >= 1) {
      println(n)
      n -= 1
    }
  }
}
