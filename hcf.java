public class hcf {
    public static void main(String[] aStrings) {
        int a = 12;
        int b = 18;

        int result = gcd(a, b);
        System.out.println("HCF of " + a + " and " + b + " is " + result);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
