class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int prefix_sum=0,count=0;

        for(int i=0;i<nums.length;i++){
            prefix_sum+=nums[i];

            //case-1 psum=k
            if(prefix_sum==k){
                count++;
            }

            //subarrays from i to j (inbetween might have same sum)
            if(map.containsKey(prefix_sum-k)){
                count+=map.get(prefix_sum-k);
            }

            map.put(prefix_sum, map.getOrDefault(prefix_sum,0)+1);

            
        }
        return count;

    }
}