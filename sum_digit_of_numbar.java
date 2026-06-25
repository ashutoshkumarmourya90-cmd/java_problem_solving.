public class sum_digit_of_numbar {
    public static void main(String[] args) {
        int num = 6686858;
        int sum = 0;
        for (int i = 0; num > 0; i++) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
