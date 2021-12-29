package VariableAndDataType

import HelloWorld.Student

object data_type {
  def main(args: Array[String]): Unit = {
    // 1. Integer
    val a1: Byte = 127
    //val a2: Byte = 128    // ERROR
    val a3: Byte = -128

    val a4 = 12   // default type: Int
    val a5 = 1324135436436L // declare Long
    //val a6: Long = 1324135436436  // declare Long ERROR
    val a7: Long = 1324135436436L   // declare Long Correct

    val b1: Byte = 10
    val b2: Byte = (10 + 10)
    println(b2)

    //val b3: Byte = (b1 + 20)  // ERROR
    val b3: Byte = (b1 + 20).toByte
    println(b3)


    // 2. Float
    val f1: Float = 1.2345f   // declare Float
    val d1 = 34.2245          // default type: Double


    // 3. Char
    val c1: Char = 'a'
    println(c1)

    val c2: Char = '9'
    println(c2)

    // Escape Character
    val c3: Char = '\t'   // tab
    val c4: Char = '\n'   // next line
    println("abc" + c3 + "def")
    println("abc" + c4 + "def")
    val c5 = '\\'   // represent '\' itself
    val c6 = '\"'   // represent '"'
    println("abc" + c5 + "def")
    println("abc" + c6 + "def")

    // ASCII
    val i1: Int = c1
    println("i1: " + i1)
    val i2:Int = c2
    println("i2: " + i2)
    val c7: Char = (i1 + 1).toChar
    println("c7: " + c7)
    val c8: Char = (i2 + 1).toChar
    println("c8: " + c8)


    // 4. Boolean
    val isTrue: Boolean = true
    println(isTrue)


    // 5. Unit, Null, Nothing

    // 5.1 Unit (AnyVal)
    def m1(): Unit = {
      println("m1 is called")
    }
    val a = m1()
    println("a: " + a)

    // 5.2 Null (AnyRef)
    //val n: Int = null   //ERROR
    var student: Student = new Student("alice", 20)
    student = null
    println("student: " + student)

    // 5.3 Nothing (Any)
    def m2(n: Int): Int = {
      if(n == 0)
        throw new NullPointerException  // Nothing
      else
        return n
    }
    val b: Int = m2(2)
    println("b: " + b)
  }
}
