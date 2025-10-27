class Solution {
    //using binary search


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int x=nums1.length;
        int y=nums2.length;

        int low=0;
        int high=x;


        while(low<=high){
            int partitionX=low+(high-low)/2;
            int partitionY=((x+y+1)/2)-partitionX;

            int maxLeft1=(partitionX==0)?Integer.MIN_VALUE: nums1[partitionX-1];
            int maxLeft2=(partitionY==0)?Integer.MIN_VALUE: nums2[partitionY-1];
            int minRight1=(partitionX==x)?Integer.MAX_VALUE: nums1[partitionX];
            int minRight2=(partitionY==y)?Integer.MAX_VALUE: nums2[partitionY];

            if(maxLeft1<=minRight2 && maxLeft2<=minRight1){
                int maxLeft=Math.max(maxLeft1,maxLeft2);
                int minRight=Math.min(minRight1,minRight2);
                if((x+y)%2==0){
                    return (double) (maxLeft+minRight)/2.0;
                }else{
                    return maxLeft;
                }
            }else if(maxLeft1>minRight2){
                high=partitionX-1;
            }else{
                low=partitionX+1;
            }
        }

        return -1;
    }
}