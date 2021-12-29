public class TestDataTypeConversion {
    public static void main(String[] args) {
        byte b = 10;
        test(b);
        char c1 = 'a';
        test(c1);
        short c2 = (short)c1;
        test(c2);
    }

    public static void test(byte b) {
        System.out.println("bbbb");
    }

    public static void test(short s) {
        System.out.println("ssss");
    }

    public static void test(char c) {
        System.out.println("cccc");
    }

    public static void test(int i) {
        System.out.println("iiii");
    }
}
