import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (i > k) set.remove(nums[i - k - 1]); // Keep the window size at k
                if (!set.add(nums[i])) return true;     // If add fails, a duplicate exists in range
            }
        return false;
    }
}