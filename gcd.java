public class gcd {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int gcb = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + "is  " + gcb);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}