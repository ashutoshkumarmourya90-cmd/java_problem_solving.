import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // crete a hash map to store the number .
        HashMap<Integer, Integer> map = new HashMap<>();
        // for loop for the each elements
        for (int i = 0; i < nums.length; i++) {
            int currentnumber = nums[i];
            // calculate the number
            int complement = target - currentnumber;
            // check he the complenemt is aldeady exist
            if (map.containsKey(complement)) {
                // if found hen
                return new int[] { map.get(complement), i };
            }
            // not found
            map.put(currentnumber, i);
        }
        return new int[] {};

    }
}
