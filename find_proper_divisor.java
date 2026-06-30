public class find_proper_divisor {
    public static void main(String[] args) {
        int n = 50;

        System.out.println("Proper divisors of " + n + ":");
        for (int d = 1; d < n; d++) {
            if (n % d == 0) {
                System.out.println(d);
            }
        }
    }
}
