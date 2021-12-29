package HelloWorld

class Student(name: String, var age: Int) {
  def printInfo(): Unit = {
    println(name + " " + age + " " + Student.school)
  }
}

// import companion object
object Student {
  val school: String = "atguigu"

  def main(args: Array[String]): Unit = {
    val alice = new Student("alice", 21)
    val fe = new Student("fe", 20)
    alice.printInfo()
    fe.printInfo()
  }
}