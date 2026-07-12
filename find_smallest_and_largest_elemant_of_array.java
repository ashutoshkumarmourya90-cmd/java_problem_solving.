public class find_smallest_and_largest_elemant_of_array {
    public static void main(String[] args){
        int[] arr = { 12,13,14,15,16};
        int smallest = arr[0];
        int largest  = arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest) {
                smallest=arr[i];
            }
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("smallest: " + smallest);
        System.out.println("largest: " + largest);
    }
}
