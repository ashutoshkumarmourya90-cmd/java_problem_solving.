public class lcm {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        int gcd = gcd(a, b);
        int lcm = (a / gcd) * b;

        System.out.println("LCM of " + a + " and " + b + " is " + lcm);
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
