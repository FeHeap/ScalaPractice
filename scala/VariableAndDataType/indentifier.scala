package VariableAndDataType

object indentifier {
  def main(args: Array[String]): Unit = {
    // (1) whe declaring, variable name: [A-Za-z_][A-Za-z0-9]*  (excluding keywords in scala)
    val hello: String = ""
    var hello123 = ""
    val _abc = 123
    //val h-b = ""      // ERROR
    //val 123abc = 234  // ERROR

    // (2) whe declaring, variable name: [-+*/#!]*
    val -+/% = "hello"
    println(-+/%)

    // (3) whe declaring, variable name: `.+` (including keywords in scala, excluding name have been used)
    val `-+ /()` = "hi"
    println(`-+ /()`)
    val `if` = 10
    println(`if`)
    val `aaaa` = 10
    println(aaaa)
    //val `-+/%` = "hello"  // ERROR
  }
}
