public class prime_in_given_rang {
    public static void main(String[] args) {
        int low = 10, high = 100;
        System.out.println("prime number between " + low + "and " + high + " are:");
        for (int i = low; i <= high; i++) {
            boolean isprime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.print(i + " ");
            }
        }
    }
}
