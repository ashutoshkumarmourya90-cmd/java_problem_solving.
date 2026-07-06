public class add_two_fractions {
    public static void main(String[] args) {
        System.out.print("enter the numerator of first fraction ");
        int num1 = Integer.parseInt(System.console().readLine());

        System.out.print("enter the denominator of first fraction ");
        int den1 = Integer.parseInt(System.console().readLine());

        System.out.print("enter the numerator of second fraction ");
        int num2 = Integer.parseInt(System.console().readLine());

        System.out.print("enter the denominator of second fraction ");
        int den2 = Integer.parseInt(System.console().readLine());

        int numerator = (num1 * den2) + (num2 * den1);
        int denominator = den1 * den2;

        System.out.println("The sum of the two fractions is: " + numerator + "/" + denominator);
    }
}
