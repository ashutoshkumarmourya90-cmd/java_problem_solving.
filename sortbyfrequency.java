import java.util.Arrays;
import java.util.HashMap;
public class sortbyfrequency {
    
    public static void main(String[] args) {

        int[] arr = {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};

        // Count frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Convert int[] to Integer[] because Arrays.sort() with Comparator
        // works only on objects, not primitive int.
        Integer[] nums = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }

        // Sort by frequency
        Arrays.sort(nums, (a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return a - b;          // Same frequency -> smaller number first
            }
            return map.get(a) - map.get(b); // Lower frequency first
        });

        System.out.println("Sorted Array by Frequency:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

