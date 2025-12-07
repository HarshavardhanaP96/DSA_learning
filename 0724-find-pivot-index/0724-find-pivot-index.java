class Solution {
    public int pivotIndex(int[] nums) {

        int rsum=0;
        for(int i=0;i<nums.length;i++){
            rsum+=nums[i];
        }
        int lsum=0;

        for(int i=0;i<nums.length;i++){
            rsum=rsum-nums[i];
            if(rsum==lsum) return i;
            lsum=lsum+nums[i];
        }

        return -1;
    }
}