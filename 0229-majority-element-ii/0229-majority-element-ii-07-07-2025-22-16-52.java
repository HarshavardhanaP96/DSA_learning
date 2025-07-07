class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int ele1=nums[0],ele2=0,count1=1,count2=0,n=nums.length;

        List<Integer> list=new LinkedList<>();

        for(int i=0;i<n;i++){
            if(ele1==nums[i]) count1++;
            else if(ele2==nums[i]) count2++;
            else if(count1==0 && ele2!=nums[i]){
                ele1=nums[i];
                count1++;
            } else if (count2==0 && ele1!=nums[i]){
                ele2=nums[i];
                count2++;
            } 
            else {
                count1--;
                count2--;
            }


        }

        count1=0;
        count2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==ele1) count1++;
            else if(nums[i]==ele2) count2++;
        }

        if(count1>=(int)(n/3)+1) list.add(ele1);
        if(count2>=(int)(n/3)+1 && ele1!=ele2) list.add(ele2);

        return list;
    }
}