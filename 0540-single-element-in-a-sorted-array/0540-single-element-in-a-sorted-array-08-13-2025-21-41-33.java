class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        return singleOccurence(nums,0,nums.length-1);
    }

    public int singleOccurence(int[] nums,int start, int end){
        
        if(start>=end) return nums[start];

        int mid=start+(end-start)/2;

        if(mid%2==1){
            mid--;
        }

        if(nums[mid]==nums[mid+1]) return singleOccurence(nums,mid+2,end);
        else return singleOccurence(nums,start,mid);
    }
}