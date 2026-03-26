class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] res=new int[n];

        k=k%n;
        int j=0;
        for(int i=n-k;i<n;i++){
            res[j++]=nums[i];
        }
        for(int i=0;i<n-k;i++){
            res[j++]=nums[i];

        }
        
        for(int i=0;i<nums.length;i++){
            nums[i]=res[i];
        }

    }
}