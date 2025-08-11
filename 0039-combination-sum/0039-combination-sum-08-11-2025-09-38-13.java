class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();

        csum(candidates,target, list, 0,0,new ArrayList<>());
        return list;
    }

    public void csum(int[] candidates, int target, List<List<Integer>> list, int index,int sum, List<Integer> elist){
        if(sum==target){
            list.add(new ArrayList<>(elist));
            return;
        }

        if(sum>target) return;

        for(int i=index;i<candidates.length;i++){
            elist.add(candidates[i]);
            csum(candidates,target, list, i,sum+candidates[i],elist);
            elist.remove(elist.size()-1);

        }
    }
}