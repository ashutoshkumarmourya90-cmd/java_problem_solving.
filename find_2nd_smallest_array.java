public class find_2nd_smallest_array {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 20, 3};

        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("second smallest: " + secondSmallest);
    }
}
