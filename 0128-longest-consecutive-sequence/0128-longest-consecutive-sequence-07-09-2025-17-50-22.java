class Solution {
    public int longestConsecutive(int[] nums) {

        int longest=1;
        int n=nums.length;

        if(n==0) return 0;
        for(int i=0;i<n;i++){

            int count=1,ele=nums[i];
            while(serachNext( nums, n, ele+1)){
                count++;
                ele++;
                System.out.println(count+" "+ele);
            }

            longest=Math.max(count,longest);
        }

        return longest;
    }

    public boolean serachNext(int[] nums, int n,int ele){

        for(int i=0;i<n;i++){
            if(nums[i]==ele) return true;
        }

        return false;
    }
}