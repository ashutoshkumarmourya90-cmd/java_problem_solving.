public class harshad_number {
    public static void main(String[] args) {
        int num = 45;

        if (isHarshad(num)) {
            System.out.println(num + " is a Harshad number.");
        } else {
            System.out.println(num + " is not a Harshad number.");
        }
    }

    public static boolean isHarshad(int n) {
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return sum != 0 && n % sum == 0;
    }
}
