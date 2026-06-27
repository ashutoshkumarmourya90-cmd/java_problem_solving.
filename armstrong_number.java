public class armstrong_number {
    public static void main(String[] args) {
        int num = 153; // change this value to test other numbers
        int original = num;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum += rem * rem * rem;
            num = num / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
