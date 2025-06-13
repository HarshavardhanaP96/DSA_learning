class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sh=new HashMap<>();
        int[] hs=new int[2];
        int n=nums.length;
        sh.put(nums[0],0);
        for(int i=1;i<n;i++){
            if(sh.containsKey(target-nums[i])){
                hs[0]=sh.get(target-nums[i]);
                hs[1]=(i);
                break;
            }
            else
                sh.put(nums[i],i);
        }
        return hs;
    }
}