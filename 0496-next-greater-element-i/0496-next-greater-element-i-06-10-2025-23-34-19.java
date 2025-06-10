class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int n1=nums1.length;
        int n2=nums2.length;

        for (int i=0;i<n1;i++){
            int nextgreat=-1;
            int position=-1;
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    position=j;
                } else if(position>=0 && nums2[j]>nums1[i]){
                    nextgreat=nums2[j];
                    break;
                }
            }
            nums1[i]=nextgreat;
        }

        return nums1;
    }
}