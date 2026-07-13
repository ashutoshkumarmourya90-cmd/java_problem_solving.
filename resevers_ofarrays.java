import java.util.Scanner;
public class resevers_ofarrays{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the of elements in arrays: ");
        int n =sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter "+ n + "elements");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("revers: ");
        for(int i= n-1; i>=0; i--){
        

            System.out.print( arr[i]+ " ");
        }
        System.out.println();
        sc.close();
    }
}