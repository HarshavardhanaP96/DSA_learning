class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;

        int maxA=0;
        while(left<right){
            int h=Math.min(height[left],height[right]);
            int a=h*(right-left);
            
            maxA=Math.max(maxA,a);
            
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
        }

        return maxA;
    }
}