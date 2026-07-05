import java.util.Scanner;

public class binary_to_octal_conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");

        String binary = scanner.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        int octal = 0;
        int n = 0;

        while (decimal > 0) {
            int temp = decimal % 8;
            octal += temp * (int) Math.pow(10, n);
            decimal /= 8;
            n++;
        }

        System.out.println("Octal equivalent: " + octal);
        scanner.close();
    }
}
