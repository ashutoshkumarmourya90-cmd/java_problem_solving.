public class hexadecimal_to_decimal_conversion {
    public static void main(String[] args) {
        System.out.print("Enter a hexadecimal number: ");
        String hex = System.console().readLine();// Read hexadecimal input from the console
        int hexadecimal = Integer.parseInt(hex, 16);// Convert hexadecimal string to integer
        int decimalhexa = 0;
        int n = 0;
        while (hexadecimal > 0) {
            int temp = hexadecimal % 16;
            decimalhexa += temp * Math.pow(16, n);
            n++;
            hexadecimal /= 16;
        }
        System.out.println("Decimal equivalent: " + decimalhexa);
    }
}
