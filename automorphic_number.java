public class automorphic_number {
    public static void main(String[] args) {
        int num = 5;
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);

        if (squareStr.endsWith(numStr)) {
            System.out.println(num + " is an automorphic number.");
        } else {
            System.out.println(num + " is not an automorphic number.");
        }
    }
}
