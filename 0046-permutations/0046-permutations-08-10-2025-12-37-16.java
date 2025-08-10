class Solution {


    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ll=new ArrayList<>();

        allperm(nums,ll,0);

        return ll;
    }

    public void allperm(int[] nums, List<List<Integer>> ll,int index){
        
        if(index==nums.length){
            List<Integer> list =toList(nums);
            ll.add(list);
            return;
        }

        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);
            allperm(nums,ll,index+1);
            swap(nums,index,i);

        }

    }


    public void swap(int[] nums, int i , int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public List<Integer> toList(int[] nums){
        List<Integer> temp=new ArrayList<>();
        for (int num : nums) {
            temp.add(num);
        }
        return temp;
    }
}