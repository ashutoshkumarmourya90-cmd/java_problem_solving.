public class convert_digits_number {
    
    public static void main(String[] args) {
        int num = 1234;
        String str = Integer.toString(num);

        System.out.println("The number is: " + str);
        System.out.println("The number of digits in " + num + " is: " + str.length());

        for (int i = 0; i < str.length(); i++) {
            char digitChar = str.charAt(i);
            int digit = digitChar - '0';
            System.out.println("Digit at index " + i + ": " + digit);
        }
    }
}


