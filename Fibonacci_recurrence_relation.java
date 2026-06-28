public class Fibonacci_recurrence_relation {
    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(2 - n);

    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }

}
