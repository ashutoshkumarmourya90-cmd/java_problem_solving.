
public class decimal_to_binary_conversion {
    public static void main(String[] args) {
        System.out.print("Enter a decimal number: ");// Prompt the user to enter a decimal number
        int decimal = Integer.parseInt(System.console().readLine());// Read decimal input from the console

        if (decimal == 0) {// Check if the input decimal number is 0
            System.out.println("Binary equivalent: 0");
            return;
        }

        StringBuilder binary = new StringBuilder();// StringBuilder to store the binary representation
        while (decimal > 0) {// Loop until the decimal number becomes 0
            int remainder = decimal % 2;// Calculate the remainder when dividing by 2
            binary.append(remainder);// Append the remainder to the binary string
            decimal /= 2;
        }

        binary.reverse();
        System.out.println("Binary equivalent: " + binary);
    }
}
