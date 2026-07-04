public class decimal_to_octal_conversion {
    public static void main(String[] srgs) {
        System.out.print("Enter a decimal number: ");
        int decimal = Integer.parseInt(System.console().readLine());
        int octal = 0;
        int n = 0;
        while (decimal > 0) {
            int temp = decimal % 8;
            octal += temp * Math.pow(10, n);
            decimal /= 8;
            n++;
        }
        System.out.println("Octal equivalent: " + octal);
    }
}
