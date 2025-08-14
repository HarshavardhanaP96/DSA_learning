class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1=nums1.length,n2=nums2.length,n=n1+n2,mid1=n/2,mid2=mid1-1;

        int ptr1=0,ptr2=0,count=0,ele1=0,ele2=0;

        while(ptr1<n1 && ptr2<n2){
            if(nums1[ptr1]<=nums2[ptr2]){
                if(count==mid1) ele1=nums1[ptr1]; 
                if(count==mid2) ele2=nums1[ptr1]; 
                ptr1++;
                count++;
            }else{
                if(count==mid1) ele1=nums2[ptr2]; 
                if(count==mid2) ele2=nums2[ptr2]; 
                ptr2++;
                count++;
            } 
        }

        while(ptr2<n2){

            if(count==mid1) ele1=nums2[ptr2]; 
            if(count==mid2) ele2=nums2[ptr2]; 
            ptr2++;
            count++;

        }

        while(ptr1<n1){
            if(count==mid1) ele1=nums1[ptr1]; 
            if(count==mid2) ele2=nums1[ptr1]; 
            ptr1++;
            count++;

        }
        System.out.println("ele1: "+ ele1 + " ele2: " + ele2 + " n: "+ n);
        return (n%2!=0)?(double)ele1:(double)(ele1+ele2)/2;
    }
}