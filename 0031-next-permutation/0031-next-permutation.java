class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;

        int ptr1=-1;
        int ptr2=-1;

        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ptr1=i;
                break;
            }
        }

        if(ptr1==-1){
            reverse(nums,0,n-1);
        } else{
            
            for(int i=n-1;i>=0;i++){
                if(nums[ptr1]<nums[i]){
                    swap(nums,ptr1, i);
                    break;
                }
            }
            reverse(nums,ptr1+1,n-1);
        }

    }

    void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}