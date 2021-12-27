public class Student {
    private String name;
    private  Integer age;
    private static String school = "atguigu";

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this.name + " " + this.age + " " + Student.school);
    }

    public static void main(String[] args) {
        Student alice = new Student("alice", 21);
        Student fe = new Student("fe", 20);
        alice.printInfo();
        fe.printInfo();
    }
}
