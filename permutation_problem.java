import java.util.Scanner;

public class permutation_problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the n number of people ");
        int n = scanner.nextInt();

        System.out.print("enter the r number of people ");
        int r = scanner.nextInt();

        if (r > n) {
            System.out.println("The permutation is: 0");
            return;
        }

        int permutation = 1;
        for (int i = 0; i < r; i++) {
            permutation *= (n - i);
        }
        System.out.println("The permutation is: " + permutation);
        scanner.close();
    }
}
