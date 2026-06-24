public class sum_of_odd_number {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                sum = sum + 1;
            }
        }
        System.out.println("Sum of even numbers is: " + sum);
    }

}
