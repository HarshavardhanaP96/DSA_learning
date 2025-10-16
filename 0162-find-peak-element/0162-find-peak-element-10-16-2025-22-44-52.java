class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length-1;
  //      if(n==0) return nums[0];
        int low=0,high=n;

        while(low<high){
            int mid=low+(high-low)/2;

            if(nums[mid]>nums[mid+1]){
                high=mid;
            }else{
                low=mid+1;
            }
        }

        return low;
    }
}