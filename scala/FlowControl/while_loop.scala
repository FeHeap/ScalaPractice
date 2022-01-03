package FlowControl

object while_loop {
  def main(args: Array[String]): Unit = {
    // while
    var a: Int = 10
    while(a >= 1) {
      println("This is a while loop: " + a)
      a -= 1
    }

    var b: Int = 0
    do {
      println("This is a while loop: " + b)
      b -= 1
    } while(b > 0)
  }
}
