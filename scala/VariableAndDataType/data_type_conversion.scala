package VariableAndDataType

object data_type_conversion {
  def main(args: Array[String]): Unit = {
    // 1. automatic type conversion
    // (1) Improve short precision to high precision automatically
    val a1: Byte = 10
    val b1: Long = 2353
    val result1: Long = a1 + b1
    val result11: Int = a1 + b1.toInt

    // (2) set the high precision value to short precision variable, report ERROR
    val a2: Byte = 10
    val b2: Int = a2
    //val c2: Byte = b2   // ERROR

    // (3) (byte, short) and char do not converse automatically
    val a3: Byte = 10
    val b3: Char = 'b'
    //val c3: Byte = b3   // ERROR
    val d3: Byte = b3.toByte
    println("d3: " + d3)
    val e3: Int = b3
    println("e3: " + e3)

    // (4) byte, short, char can + - * / with each other, after conversed to Int automatically
    val a4: Byte = 12
    val b4: Short = a4
    val c4: Char = 'c'
    val result4: Int = a4 + b4
    val result44: Int = a4 + b4 + c4
    println("result44: " + result44)


    // 2. casts
    // (1) conversing the high precision value to short precision, must use casts
    val n1: Int = 2.5.toInt
    println("n1: " + n1)
    val n2: Int = -2.9.toInt
    println("n2: " + n2)

    // (2) casts affect the most close number or variable. is able to use () to increase priority
    val n3: Int = 2.6.toInt + 3.7.toInt
    println("n3: " + n3)
    val n4: Int = (2.6 + 3.7).toInt
    println("n4: " + n4)


    // 3. conversion between number and String
    // (1) converse number to String
    val n: Int = 27
    val s: String = n + ""
    println("s: " + s)

    // (2) converse String to number
    val m: Int = "12".toInt
    val f1: Float = "12.3".toFloat
    //val f2: Int = "12.3".toInt    // ERROR occurs when process executing
    val f3: Int = "12.3".toDouble.toInt
    println("f3: " + f3)
  }
}
