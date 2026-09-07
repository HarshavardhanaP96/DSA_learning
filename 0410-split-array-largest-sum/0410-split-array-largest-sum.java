class Solution {
    public int splitArray(int[] nums, int k) {
        
        int low=0,high=0;

        for(int num:nums){
            low = Math.max(low, num); // largest element
            high += num;              // entire array as one subarray
        }


        while(low<=high){
            int mid=low+(high-low)/2;

            if(canSplit(nums,k,mid)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return low;

    }

    public boolean canSplit(int[] arr, int k, int maxVal){
        int subArrayCount=1,sum=0;

        for(int num:arr){
            if(sum+num<=maxVal){
                sum+=num;
            }else{
                sum=num;
                subArrayCount++;
            }

            if(subArrayCount>k) return false;

        }

        return true;
    
    }
}