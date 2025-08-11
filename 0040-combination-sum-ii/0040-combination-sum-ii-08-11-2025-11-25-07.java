class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(candidates);
        csum(candidates, target,0,0, list, new ArrayList<>());
        return list;
    }

    public void csum(int[] candidates, int target, int index, int sum, List<List<Integer>> list, List<Integer> temp){

        if(sum==target){
            list.add(new ArrayList<>(temp));

        }

        if(index>=candidates.length||sum>target) return;

        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1]) continue;
            temp.add(candidates[i]);
            csum(candidates, target,i+1,sum+candidates[i], list, temp);
            temp.remove(temp.size()-1);
        }


    }
}