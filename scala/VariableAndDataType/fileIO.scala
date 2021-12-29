package VariableAndDataType

import java.io.{File, PrintWriter}
import scala.io.Source

object fileIO {
  def main(args: Array[String]): Unit = {
    // 1. read data from file
    Source.fromFile("src/main/resources/test.txt").foreach(print)

    // 2. write data into file
    val writer = new PrintWriter(new File("src/main/resources/output.txt"))
    writer.write("hello scala from scala from java writer")
    writer.close()
  }
}
