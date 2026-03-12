class Solution {
    public int longestConsecutive(int[] nums) {

        int n=nums.length;
        if(n==0||n==1) return n;

        Set<Integer> has=new HashSet<>();
        int longestCount=0;

        for(int i=0;i<n;i++){
            has.add(nums[i]);
        }

        for(int num:nums){

            int count=1;
            int currentNum=num;

            if(!has.contains(currentNum-1)){
                while(has.contains(currentNum+1)){
                    count++;
                    currentNum++;
                }
            }

            longestCount=Math.max(count,longestCount);            
        }

        return longestCount;

    }
}