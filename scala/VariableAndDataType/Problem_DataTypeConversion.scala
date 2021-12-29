package VariableAndDataType

/*
  128: Int type, 4 bytes, 32 bits
  origin:     0000 0000 0000 0000 0000 0000 1000 0010
  complement: 0000 0000 0000 0000 0000 0000 1000 0010

  get the last byte, Byte
  origin:     1000 0010
  complement: 1111 1110
  represent number -126
 */

object Problem_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    val n: Int = 130
    val b: Byte = n.toByte
    println(b)
  }
}
