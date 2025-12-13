class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        HashMap<Integer, Integer> check=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(check.containsKey(target-nums[i])){
                ans[1]=i;
                ans[0]=check.get(target-nums[i]);
                break;
            }
            check.put(nums[i],i);
        }

        return ans;
    }
}