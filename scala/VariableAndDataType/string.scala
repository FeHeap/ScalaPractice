package VariableAndDataType

object string {
  def main(args: Array[String]): Unit = {
    // (1) String, join with symbol '+'
    val name: String = "Fe"
    val age: Int = 20
    println(age + " years old, " + name + " studies in atguigu.")
    // '*' is used to copy and join String N times
    println(name * 3)

    // (2) Formatted output: printf()
    printf("%d years old, %s studies in atguigu.\n", age, name)

    // (3) String interpolation, template strings: '$'
    println(s"$age years old, $name studies in atguigu.")
    println(s"${age} years old, ${name} studies in atguigu.")

    val num: Double = 2.3456
    println(s"The num is ${num}")
    printf(f"The num is ${num}%2.2f\n")   // Formatted template strings
    println(raw"The num is ${num}%2.2f")

    // """ """ String, keep the original format
    val sql = s"""
       |select *
       |from
       |  student
       |where
       |  name = ${name}
       |and
       |  age > ${age}
       |""".stripMargin
    println(sql)
  }
}
