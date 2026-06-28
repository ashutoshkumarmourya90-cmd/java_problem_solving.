public class Fibonai_Series_upto_nth_term {
    public static void main(String[] args) {
        int n = 10; // Print first 10 terms

        // First two Fibonacci numbers
        int fib1 = 0, fib2 = 1;

        System.out.println("Fibonacci Series upto " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(fib1 + " ");// it mean that we are add with 01123 not 1123

            // Calculate next Fibonacci number
            int nextFib = fib1 + fib2;// it means that we adding the both no.
            fib1 = fib2;// it means that 0 we take 1 and then next 1 to 2 , 2to 3
            fib2 = nextFib;// final no. 2as the next no.
        }
    }
}
