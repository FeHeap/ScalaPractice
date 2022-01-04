package FunctionalProgramming

object Practice_CollectionOperation {
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(12, 45, 75, 98)

    // operate array, abstract the operator, return a new array after operation
    def arrayOperation(array: Array[Int], op: Int=>Int): Array[Int] = {
      for (elem <- array) yield op(elem)
    }

    // define a +1 operation
    def addOne(elem: Int): Int = {
      elem + 1
    }

    // call function
    val newArray1: Array[Int] = arrayOperation(arr, addOne)

    println(newArray1.mkString(", "))

    // pass anonymous function, implement elem *= 2
    val newArray2: Array[Int] = arrayOperation(arr, _ * 2)
    println(newArray2.mkString(", "))
  }
}
