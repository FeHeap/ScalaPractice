package FunctionalProgramming

object lambda {
  def main(args: Array[String]): Unit = {
    val fun = (name: String) => { println(name) }
    fun("atguigu")
    println("=================")

    // pass function as a parameter
    def f(func: String=>Unit): Unit = {
      func("atguigu")
    }
    f(fun)
    f( (name: String) => { println(name) } )
    println("=================")

    // simplify anonymous function
    // (1) Omit the type of parameter, it will inference automatically
    f( (name) => {
      println(name)
    } )
    // (2) Omit parameter's (), if there is only one parameter
    f( name => {
      println(name)
    } )
    // (3) Omit body's {}, if there is only one line
    f( name => println(name) )
    // (4) Omit parameter(replace by _), if the parameter was called only once in the body
    f( println(_) )
    // (5) Omit _, if it's able to inference the parameter if a function body
    f( println )
    println("=================")

    // example, define a function, only operates 1 and 2, but the operator pass as parameter
    def dualFunctionOneAndTwo(fun: (Int, Int)=>Int): Int = {
      fun(1, 2)
    }

    val add = (a: Int, b: Int) => a + b
    val minus = (a: Int, b: Int) => a - b
    println(dualFunctionOneAndTwo(add))
    println(dualFunctionOneAndTwo(minus))

    // simplify anonymous function
    println(dualFunctionOneAndTwo((a: Int, b: Int) => a + b))
    println(dualFunctionOneAndTwo((a: Int, b: Int) => a - b))

    println(dualFunctionOneAndTwo((a, b) => a + b))
    println(dualFunctionOneAndTwo( _ + _ ))
    println(dualFunctionOneAndTwo((a, b) => a - b))
    println(dualFunctionOneAndTwo( _ - _ ))
  }
}
