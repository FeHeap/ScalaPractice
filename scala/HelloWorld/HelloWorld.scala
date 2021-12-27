package HelloWorld

/*
*   object: keyword, declare a object(companion object)
* */
object HelloWorld {
  /*
  *   main method: can be called and executed from outside
  *   def method_name(parameter_name: parameter_data_type): data_type_method_return = { the body of method }
  * */
  def main(args: Array[String]): Unit = {
    println("hello world")
    System.out.println("hello scala from java")
  }
}
