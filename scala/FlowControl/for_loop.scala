package FlowControl


object for_loop {
  def main(args: Array[String]): Unit = {
    // java for grammar: for(int i = 1; i <= 10; i++) { System.out.println(i + ". hello world"); }

    // 1. range
    for( i <- 1 to 10) {
      println(i + ". hello world")
    }
    for(i: Int <- 1.to(10)) {
      println(i + ". hello world")
    }
    println("=================")

    for(i <- Range(1, 10)) {
      println(i + ". hello world")
    }
    for(i <- 1 until 10) {
      println(i + ". hello world")
    }
    println("=================")


    // 2. set
    for(i <- Array(12, 34, 56)) {
      println(i)
    }
    for(i <- List(12, 34, 56)) {
      println(i)
    }
    for(i <- Set(12, 34, 56)) {
      println(i)
    }
    println("=================")


    // 3. loop guard
    for(i <- 1 to 10) {
      if(i != 5) {
        println(i)
      }
    }

    for(i <- 1 to 10 if i != 5) {
        println(i)
    }
    println("=================")

    // 4. step
    for(i <- 1 to 10 by 2) {
      println(i)
    }
    for(i <- (1 to 10).by(2)) {
      println(i)
    }
    println("-----------------")
    for(i <- 13 to 30 by 3) {
      println(i)
    }
    println("-----------------")
    for(i <- 30 to 13 by -2) {
      println(i)
    }
    println("-----------------")
    for(i <- 10 to 1 by -1) {
      println(i)
    }
    for(i <- 1 to 10 reverse) {
      println(i)
    }
    println("-----------------")
//    for(i <- 30 to 13 by 0) {
//      println(i)
//    }   // error, step cannot be 0.
    for(data <- 1.0 to 10.0 by 0.5) {
      println(data)
    }
    println("=================")


    // 5. nested loop
    for(i <- 1 to 3) {
      for(j <- 1 to 3) {
        println("i = " + i + ", j = " + j)
      }
    }
    println("-----------------")
    for(i <- 1 to 4; j <- 1 to 5) {
      println("i = " + i + ", j = " + j)
    }
    println("=================")


    // 6. introduce variable
    for(i <- 1 to 10) {
      val j = 10 - i
      println("i = " + i + ", j = " + j)
    }
    for(i <- 1 to 10; j = 10 - i) {
      println("i = " + i + ", j = " + j)
    }
    for {
      i <- 1 to 10
      j = 10 - i
    } {
      println("i = " + i + ", j = " + j)
    }
    println("=================")


    // 7. return of for
    val a: Unit = for(i <- 1 to 10) {
      println(i)
    }
    println("a = " + a)
    val b: Unit = for(i <- 1 to 10) { // for default return ()
      i
    }
    println("b = " + b)
    val c: IndexedSeq[Int] = for(i <- 1 to 10) yield i * i
    println("c = " + c)
  }
}
