class Solution {
    public int longestConsecutive(int[] nums) {

        int longest = 1;
        int n = nums.length;

        if (n == 0 || n == 1) return n;  // Edge cases handled

        TreeSet<Integer> s = new TreeSet<Integer>();
        for (int i = 0; i < n; i++) {
            s.add(nums[i]);  // Deduplicate and sort
        }

        int prev = s.pollFirst();  // Start from the smallest number
        int count = 1;

        while (s.size() != 0) {
            int current = s.pollFirst();
            if (current == prev + 1) {
                count++;  // Consecutive number
                if (count > longest) longest = count;
            } else {
                count = 1;  // Reset if not consecutive
            }
            prev = current;
        }

        return longest;
    }
}
