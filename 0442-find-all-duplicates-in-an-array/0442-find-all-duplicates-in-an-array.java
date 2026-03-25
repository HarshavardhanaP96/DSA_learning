class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList<>();

        int i=0;
        while(i<nums.length){

            //changes while swapping. hence preseve.
            int correctIdx=nums[i]-1;

            if(nums[i]!=nums[correctIdx]){
                int temp=nums[i];
                nums[i]=nums[correctIdx];
                nums[correctIdx]=temp;
            }else{
                i++;
            }
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                res.add(nums[j]);
            }
        }

        return res;

    }
}