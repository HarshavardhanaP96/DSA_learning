class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,max=0, n=nums.length;

        for (int i=0;i<n;i++){
            if(nums[i]==1) count++;
            else{
                if(count>max) {
                    max=count;
                }
                count=0;
            }

            System.out.println(count+" "+max);
        }

        

        return (count>max)?count:max;
    }
}