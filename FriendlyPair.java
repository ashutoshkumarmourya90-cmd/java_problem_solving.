public class FriendlyPair {
    public static void main(String[] args) {
        int a = 6;
        int b = 28;

        int sumA = sumOfDivisors(a);
        int sumB = sumOfDivisors(b);

        if (sumA * b == sumB * a) {
            System.out.println(a + " and " + b + " are a friendly pair.");
        } else {
            System.out.println(a + " and " + b + " are not a friendly pair.");
        }
    }

    public static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
