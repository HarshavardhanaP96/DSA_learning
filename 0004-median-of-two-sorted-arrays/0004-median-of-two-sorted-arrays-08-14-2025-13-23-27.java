class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
        
        Arrays.sort(arr);
        int end =arr.length-1;
        if(end%2==0){
            return arr[end/2];
        }else{
            return (double)(arr[end/2]+arr[end/2+1])/2;
        }
    }
}