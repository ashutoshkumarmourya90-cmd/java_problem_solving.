public class strong_number {
    public static void main(String[] args) {
        int low = 1;
        int high = 999;

        System.out.println("Strong numbers between " + low + " and " + high + ":");

        for (int num = low; num <= high; num++) {
            int original = num;
            int sum = 0;
            int temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                int factorial = 1;
                for (int i = 1; i <= digit; i++) {
                    factorial *= i;
                }
                sum += factorial;
                temp /= 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }
    }
}
