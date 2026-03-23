class Solution {
    public int climbStairs(int n) {
        int n1=1;
        int n2=2;
        if(n==1) return n1;

        for(int i=3;i<=n;i++){
            int temp=n1;
            n1=n2;
            n2=n1+temp;
        }

        return n2;

    }
}