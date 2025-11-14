import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists=new LinkedList<>();

        backtrack(nums, lists, new LinkedList<Integer>(), 0);
        return lists;
    }

    public void backtrack(int[] nums,List<List<Integer>> lists, List<Integer> templist, int start){


        lists.add(new ArrayList<>(templist));


        for(int i=start;i<nums.length;i++){


            if(i>start && nums[i]==nums[i-1]) continue;

            //adding next element to the temp list
            templist.add(nums[i]);
            backtrack(nums, lists, templist, i+1);

            templist.removeLast();
        }


    }
}
