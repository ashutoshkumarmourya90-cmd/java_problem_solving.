import java.util.Scanner;

public class GratestOfF_N_NumberUseingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to compare? ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, numbers[i]);
            min = Math.min(min, numbers[i]);
        }

        System.out.println("Greatest number is " + max);
        System.out.println("Smallest number is " + min);

        scanner.close();
    }
}
// this code i have not writen for myself in chat asked that if user want to
// give then .
// authmate it write the code
