class Solution {
    public int fib(int n) {
        int x=0,y=1;
        if(n==0) return x;
        if(n==1) return y;
        int z=0;
        for(int i=2;i<=n;i++){
            z=x+y;
            x=y;
            y=z;
        }
        return z;
        
    }
}