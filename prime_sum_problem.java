public class prime_sum_problem {
    public static void main(String[] args) {
        int n = 50;
        int flag = 0;

        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i)) {
                int j = n - i;
                if (isPrime(j)) {
                    System.out.println("The two prime numbers are " + i + " and " + j);
                    System.out.println("Their sum is " + (i + j));
                    flag = 1;
                    break;
                }
            }
        }

        if (flag == 0) {
            System.out.println(n + " cannot be expressed as the sum of two prime numbers");
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

