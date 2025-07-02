class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length==1) return 1;

        int slow=0, fast=1;


        int n=nums.length;
        while(fast!=n){
            if(nums[slow]==nums[fast]) fast++;
            else{
                nums[slow+1]=nums[fast];
                slow++;
                fast++;

            }
        }
        return slow+1;

    }
}