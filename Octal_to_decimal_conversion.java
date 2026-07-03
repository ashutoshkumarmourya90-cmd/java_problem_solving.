import java.util.Scanner;

public class Octal_to_decimal_conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        String octal = sc.nextLine();

        int decimal = 0;
        int power = 1;

        for (int i = octal.length() - 1; i >= 0; i--) {
            char ch = octal.charAt(i);

            if (ch >= '0' && ch <= '7') {
                int digit = ch - '0';
                decimal += digit * power;
                power *= 8;
            } else {
                System.out.println("Invalid octal number.");
                sc.close();
                return;
            }
        }

        System.out.println("Decimal value: " + decimal);
        sc.close();
    }
}
