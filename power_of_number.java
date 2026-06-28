public class power_of_number {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        int power = 1;

        for (int i = 0; i < exponent; i++) {
            power *= base;
        }

        System.out.println(base + " raised to the power " + exponent + " is " + power);
    }
}
