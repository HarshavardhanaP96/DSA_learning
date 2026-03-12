class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;

        if (n == 0 || n == 1) return n;  // Edge cases handled

        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            s.add(nums[i]);  
        }

        int longest = 0;

        for(int num : s){

            if(!s.contains(num-1)){  //// avoids repition of cycle

                int current=num;
                int count=1;

                while(s.contains(current+1)){
                    count++;
                    current++;
                }

                if(longest<count) longest=count;
            }

        }

        return longest;
    }
}