class Solution {
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1,pos=-1;

        if(end==0){
            return (target!=nums[0])? -1:0;
        }


        int k= bsearch(nums,start, end);
        System.out.println("K"+ k);


        if(target>=nums[0]){
            System.out.println(1);
            pos= position(nums, target,0, k-1);

        } else {
            System.out.println(2);

            pos= position(nums, target,k,end);
        }
        
        return pos;
    }

    public int bsearch(int[] nums, int start, int end){
        if(start>=end) return start;
        int mid=start+(end-start)/2;

        System.out.println("start: "+ start + " mid: " + mid +" end: "+ end);

        if(nums[mid]>nums[end]) return bsearch(nums,mid+1,end);
        else return bsearch(nums, start,mid);
    }

    public int position(int[] nums, int target, int start, int end){
        if(start>end) return -1;

        int mid=start+(end-start)/2;

        System.out.println(mid);

        
        if(nums[mid]==target) return mid;

        if(nums[mid]<target) return position(nums,target,mid+1,end);
        else return position(nums,target, start,mid-1);
    }
}