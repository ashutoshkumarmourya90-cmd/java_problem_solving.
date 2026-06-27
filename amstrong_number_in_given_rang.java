public class amstrong_number_in_given_rang {
    public static void main(String[] args) {
        int low = 10, high = 1000;
        System.out.println("Armstrong numbers between " + low + " and " + high + ":");

        for (int num = low; num <= high; num++) {
            int original = num;
            int temp = num;
            int digits = 0;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = num;
            int sum = 0;
            while (temp > 0) {
                int rem = temp % 10;
                sum += Math.pow(rem, digits);
                temp /= 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }
    }
}
