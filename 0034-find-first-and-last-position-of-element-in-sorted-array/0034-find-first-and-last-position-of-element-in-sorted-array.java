class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=firstOccurence(nums, target);
        int end=lastOccurence(nums, target);

        int[] arr=new int[2];
        arr[0]=start;
        arr[1]=end;
        return arr;
    }

    public int firstOccurence(int[] nums, int target){
        int low=0,ans=-1,high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target){
                ans=mid;
                high=mid-1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return ans;
    }

    public int lastOccurence(int[] nums, int target){
        int low=0,ans=-1,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target){
                ans=mid;
                low=mid+1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return ans;
    }

}