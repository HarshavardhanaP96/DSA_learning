class Solution {
    //using binary search


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if(nums1.length>nums2.length) return findMedianSortedArrays(nums2, nums1);

        int m=nums1.length;
        int n=nums2.length;
        int low=0;
        int high=m;
        int halfLen=(m+n+1)/2;

        while(low<=high){
            int mid1=low+(high-low)/2;
            int mid2=halfLen-mid1;

            int maxLeft1=(mid1==0)?Integer.MIN_VALUE:nums1[mid1-1];
            int minRight1=(mid1==m)?Integer.MAX_VALUE:nums1[mid1];

            int maxLeft2=(mid2==0)?Integer.MIN_VALUE:nums2[mid2-1];
            int minRight2=(mid2==n)?Integer.MAX_VALUE:nums2[mid2];

            if(maxLeft1<=minRight2 && maxLeft2<=minRight1){

                if((m+n)%2!=0){
                    return (double)Math.max(maxLeft1,maxLeft2);
                }else{
                    return (double) (Math.max(maxLeft1,maxLeft2)+Math.min(minRight1,minRight2))/2;
                }

            }else if(maxLeft1>minRight2){
                high=mid1-1;
            }else{
                low=mid1+1;
            }
        }

        return -1;
    }
}