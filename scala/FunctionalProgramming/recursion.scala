package FunctionalProgramming

import scala.annotation.tailrec

object recursion {
  def main(args: Array[String]): Unit = {
    println(fact(5))
    println(tailFact(5))
  }

  // implement count factorial by recursion
  def fact(n: Int): Int = {
    // basic situation 0! = 1
    if(n == 0) return 1;
    fact(n-1) * n;
  }

  // implement count factorial by tail recursion
  def tailFact(n: Int): Int = {
    @tailrec
    def loop(n: Int, currRes: Int): Int = {
      if(n == 0) return currRes
      loop(n-1, currRes * n)
    }
    loop(n, 1)
  }
}
