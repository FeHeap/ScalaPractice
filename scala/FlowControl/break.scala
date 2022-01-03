package FlowControl

import scala.util.control.Breaks

object break {
  def main(args: Array[String]): Unit = {
    // 1. implement break by throw exception
    try {
      for(i <- 0 until 5) {
        if( i == 3) {
          throw new RuntimeException
        }
        println(i)
      }
    } catch {
      case e: Exception => // do nothing, just implement break
    }
    println("here is out side of loop")

    // 2. implement throw and catch by method break in class Breaks in Scala
    Breaks.breakable(
      for(i <- 0 until 5) {
        if( i == 3) {
          Breaks.break()
        }
        println(i)
      }
    )
    println("here is out side of loop")
  }
}
