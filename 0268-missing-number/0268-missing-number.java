class Solution {
    public int missingNumber(int[] nums) {
        int i=0,n=nums.length;

        while(i<n){
            int rightidx=nums[i];

            if(rightidx<n && nums[i]!=i){
                int temp=nums[i];
                nums[i]=nums[rightidx];
                nums[rightidx]=temp;
            }else{
                i++;
            }
        }

        for(int j=0;j<n;j++){
            if(j!=nums[j]) return j;
        }

        return -1;
    }
}