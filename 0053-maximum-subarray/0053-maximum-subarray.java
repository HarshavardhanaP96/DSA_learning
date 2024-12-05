class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        if(n<1) return 0;
        if(n==1) return nums[0];
        int max;
        int sum=0; int maxsum=Integer.MIN_VALUE; int i=0;
        while(i<n){
            sum+=nums[i];
            if(maxsum<sum){
                maxsum=sum;
            }
            
            if(sum<0){
                sum=0;
            }
            i++;
        }
        return maxsum;
    }
}