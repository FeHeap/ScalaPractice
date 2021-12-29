package Operator

object operator {
  def main(args: Array[String]): Unit = {
    // 1. Arithmetic Operator
    val result1: Int = 10 / 3
    println(result1)

    val result2: Double = 10 / 3
    println(result2)

    val result3: Double = 10.0 / 3
    println(result3)
    println(result3.formatted("%5.2f"))

    val result4: Int = 10 % 3
    println(result4)


    // 2. Relational Operator
    val s1: String = "hello"
    val s2: String = new String("hello")
    println(s1 == s2)       // compare content of String
    println(s1.equals(s2))  // compare content of String
    println(s1.eq(s2))      // compare memory location


    //3. Logical Operator
    def m(n: Int): Int = {
      println("m is called.")
      return n
    }
    val n = 1
    println((4 > 5) && (m(n) > 0))
    println((4 < 5) && (m(n) > 0))

    // detect whether a String is empty
    def isNotEmpty(str: String): Boolean = {
      return str != null && !("".equals(str.trim))
    }
    println(isNotEmpty(null))


    // 4. Assignment Operator (Scala doesn't contain ++ and --)
    var b: Byte = 10
    //b += 1    // ERROR
    var i: Int = 12
    i += 1
    println(i)


    // 5. Bitwise Operator
    val a1 = 60
    println(a1 << 3)
    val a2: Byte = 60
    println(a2 << 3)
    println(a2 >> 2)

    val c: Short = -13
    println(c << 2)
    println(c >> 2)
    println(c >>> 2)


    // 6. the essence of operator
    val n1: Int = 12
    val n2: Int = 37
    println(n1.+(n2))
    println(n1 + n2)

    println(1.34.*(25))
    println(1.34 * 25)
    println(7.5 toString)
    println(7.5 toInt)
    println(7.5.toInt toString)
  }
}
