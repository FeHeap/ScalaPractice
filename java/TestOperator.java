public class TestOperator {
    public static void main(String[] args) {
        // Relational Operator
        String s1 = "hello";
        String s2 = new String("hello");

        Boolean isEqual = (s1 == s2);
        System.out.println(isEqual);
        System.out.println(s1.equals(s2));


        System.out.println("============================");


        // Assignment Operator
        byte b = 10;
        b = (byte)(b + 1);
        b += 1;     // default do casts
        System.out.println(b);

        // ++ --
        int x = 15;
        int y = x++;
        System.out.println("x = " + x + ", y = " + y);

        x = 15;
        y = ++x;
        System.out.println("x = " + x + ", y = " + y);

        x = 23;
        x = x++; // temp = x++; x = temp;
        System.out.println("x = " + x);
    }
}
