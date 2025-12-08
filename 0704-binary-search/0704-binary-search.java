class Solution {
    public int search(int[] nums, int target) {
        int low=nums[0],high=nums[nums.length-1];

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target) return mid;
            else if(target<nums[mid]) high=mid-1;
            else low=mid+1;
        }

        return -1;
    }
}