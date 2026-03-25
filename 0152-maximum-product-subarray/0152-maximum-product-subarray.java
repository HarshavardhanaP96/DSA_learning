class Solution {
    public int maxProduct(int[] nums) {
        
        int maxSoFar=nums[0],minSoFar=nums[0],result=nums[0];

        for(int i=1;i<nums.length;i++){
            
            int current=nums[i];

            if(current<0){
                int temp=maxSoFar;
                maxSoFar=minSoFar;
                minSoFar=temp;
            }

            //to handle zero (consider current)
            maxSoFar=Math.max(current,maxSoFar*current);
            minSoFar=Math.min(current,minSoFar*current);

            result=Math.max(result,maxSoFar);

        }

        return result;
    }
}