public class TestRecursion {
    public static void main(String[] args) {
        // count factorial
        System.out.println(factorial_loop(5));
        System.out.println(factorial_recursion(5));
    }

    // 1. implement by loop
    public static int factorial_loop(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 1. implement by recursion
    public static int factorial_recursion(int n) {
        // basic situation 0! = 1
        if(n == 0) return 1;
        return factorial_recursion(n-1) * n;
    }
}
