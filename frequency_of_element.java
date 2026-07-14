import java.util.Arrays;

public class frequency_of_element {
    public static void frequency_of_element(int arr[],int n){
        boolean visited[]=new boolean[n];
        Arrays.fill(visited,false);

        System.out.println("enter arrays element" );
        for(int i=0; i<n;i++){//cheakk how many no. is their
            if(visited[i]==true){
                continue;
            }
           int count =1;//take a no. count 1
           for(int j=i+1;j<n ;j++){//move forword 
            if(arr[i]==arr[j]){//if both are equal 
                count++;//count +1
                visited[j]=true;
           }
            
        }
        System.out.println(arr[i] + " occurs " + count +" times ");
    }
    }
    public static void main(String[] args){
       int  arr[]=  new int[] {10,2,2,2,14,14,10};
        int n=arr.length;
        frequency_of_element(arr,n);
    } 

}
