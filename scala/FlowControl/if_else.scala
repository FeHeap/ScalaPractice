package FlowControl

import scala.io.StdIn

object if_else {
  def main(args: Array[String]): Unit = {
    println("How old are you?")
    val age: Int = StdIn.readInt()


    // 1. one branch
    if(age >= 18) {
      println("Adult")
    }
    println("====================")


    // 2. two branch
    if(age >= 18) {
      println("Adult")
    } else {
      println("Young")
    }
    println("====================")


    // 3. n branch
    if(age <= 6) {
      println("Child")
    } else if(age < 18) {
      println("Young")
    } else if(age < 60) {
      println("Adult")
    } else {
      println("Old")
    }
    println("====================")


    // 4. return of if...else...
    val result1: Unit = if(age <= 6) {
      println("Child")
    } else if(age < 18) {
      println("Young")
    } else if(age < 60) {
      println("Adult")
    } else {
      println("Old")
    }
    println("result1: " + result1)

    val result2: String = if(age <= 6) {
      println("Child")
      "Child"
    } else if(age < 18) {
      println("Young")
      "Young"
    } else if(age < 60) {
      println("Adult")
      "Adult"
    } else {
      println("Old")
      "Old"
    }
    println("result2: " + result2)

    val result3: Any = if(age <= 6) {
      println("Child")
      "Child"
    } else if(age < 18) {
      println("Young")
      "Young"
    } else if(age < 60) {
      println("Adult")
      age
    } else {
      println("Old")
      age
    }
    println("result3: " + result3)

    // ternary if-else operator in java (a? b: c)
    val result4: String = if(age >= 18) {
      "Adult"
    } else {
      "Young"
    }

    val result5 = if(age >= 10) "Adult" else "young"
    println("====================")

    // 5. nested branch
    if(age >= 18) {
      if(age >= 60) {
        println("Old")
      } else {
        println("Adult")
      }
    } else {
      if(age <= 6) {
        println("Child")
      } else {
        println("Young")
      }
    }
  }
}
