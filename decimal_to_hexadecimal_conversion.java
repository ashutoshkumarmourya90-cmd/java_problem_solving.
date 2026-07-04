public class decimal_to_hexadecimal_conversion {
    public static void main(String[] args) {
        System.out.print("Enter a decimal number: ");
        int decimal = Integer.parseInt(System.console().readLine());

        if (decimal == 0) {
            System.out.println("Hexadecimal equivalent: 0");
            return;
        }

        StringBuilder hex = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 16;
            if (remainder < 10) {
                hex.append(remainder);
            } else {
                hex.append((char) ('A' + remainder - 10));
            }
            decimal /= 16;
        }

        System.out.println("Hexadecimal equivalent: " + hex.reverse());
    }
}
