class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        if(x==1) return 1;
        int low=1,high=x,ans=1;

        while(low<=high){
            int mid=low+(high-low)/2;
            long sq=(long)mid*mid;
            if(sq==x) return mid;
            else if(mid*mid>x) high=mid-1;
            else{
                ans=mid;
                low=mid+1;
            }

        }

        return ans;
    }
}