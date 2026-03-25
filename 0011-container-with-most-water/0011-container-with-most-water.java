class Solution {
    public int maxArea(int[] height) {
        int start=0,end=height.length-1,minH=0,maxArea=0;
        while(start<end){

            minH=Math.min(height[start],height[end]);
            maxArea=Math.max(maxArea,(minH*(end-start)));

            if(height[start]>height[end]){
                end--;
            }else{
                start++;
            }
        }

        return maxArea;
    }
}