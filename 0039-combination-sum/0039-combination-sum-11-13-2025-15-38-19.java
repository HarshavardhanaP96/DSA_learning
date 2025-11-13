class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();

        csum(candidates,target, list, 0,0,new ArrayList<>());
        return list;
    }

    public void csum(int[] candidates, int target, List<List<Integer>> list, int index,int sum, List<Integer> elist){
        if(index>=candidates.length||sum>target) return;
        
        if(sum==target){
            list.add(new ArrayList<>(elist));
            return;
        }

        elist.add(candidates[index]);
        csum(candidates,target, list, index,sum+candidates[index],elist);

        elist.remove(elist.size()-1);
        csum(candidates,target, list, index+1,sum,elist);


    }
}