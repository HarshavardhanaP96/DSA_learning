class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(candidates);
        csum(candidates, target,0,0, list, new ArrayList<>());
        return list;
    }

    public void csum(int[] candidates, int target, int index, int sum, List<List<Integer>> list, List<Integer> temp){

        if(sum==target){
            if(!list.contains(temp)){
                list.add(new ArrayList<>(temp));

            }
            return;
        }

        if(index>=candidates.length||sum>target) return;


        temp.add(candidates[index]);
        csum(candidates, target,index+1,sum+candidates[index], list, temp);
        temp.remove(temp.size()-1);
        csum(candidates, target,index+1,sum, list, temp);

    }
}