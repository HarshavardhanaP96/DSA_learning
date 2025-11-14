class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();

        allsubset(nums, ans, new ArrayList<>(),0);

        return ans;
    }

    public void allsubset(int[] nums, List<List<Integer>> ans, List<Integer> temp, int start){
        
        //if(start==nums.length) return; loop will catch the out of index

        ans.add(new ArrayList<>(temp));

        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            allsubset(nums, ans, temp,i+1);
            temp.remove(temp.size()-1);
        }

    }
}