import java.util.*;

public class find_number_of_digits_in_an_integer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int count=0;
        while(n>0){
            n/=10;
            count++;

        }
        System.out.println("Number of digits: " + count);
    }
}
