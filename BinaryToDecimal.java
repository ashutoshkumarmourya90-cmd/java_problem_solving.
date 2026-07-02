import java.util.Scanner;
import java.math.BigInteger;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String bin;
        if (args.length > 0) {
            bin = args[0].trim();
        } else {
            System.out.print("Enter a binary number: ");
            Scanner sc = new Scanner(System.in);
            bin = sc.nextLine().trim();
            sc.close();
        }

        if (!bin.matches("[01]+")) {
            System.err.println("Invalid binary input: only 0 and 1 allowed.");
            System.exit(1);
        }

        BigInteger result = BigInteger.ZERO;
        for (char c : bin.toCharArray()) {
            result = result.shiftLeft(1).add(BigInteger.valueOf(c - '0'));
        }

        System.out.println(result.toString());
    }
}
