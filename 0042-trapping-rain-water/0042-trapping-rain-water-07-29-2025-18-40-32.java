class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int waterTrapped=0,pmax=0,smax=0;

        int[] prefix=new int[n];
        int[] sufix=new int[n];

        prefix[0]=0;
        sufix[n-1]=0;

        int i=1,j=n-2;
        while(i<n){
            prefix[i]=Math.max(prefix[i-1],height[i-1]);


            sufix[j]=Math.max(sufix[j+1],height[j+1]);

            i++;
            j--;
        }

        for(int l=0;l<n;l++){
            int ans=Math.min(prefix[l],sufix[l])-height[l];
            if(ans>0) waterTrapped=waterTrapped+ans;
            
        }
        return waterTrapped;
    }
}