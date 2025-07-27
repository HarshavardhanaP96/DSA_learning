class Solution {
    int count=0;
    public int uniquePaths(int m, int n) {

        //Number of steps required to reach the end point
        int steps=m+n-2;

        //Mathematically using binomial coefficiant approach
        //number of ways=(m+n-2)!/[(m-1)!*(n-1)!]

        //code is looped after further simplification of mathematical computation.

        int minLoop=(m<n)?m-1:n-1;

        long res=1;
        for( int i=1;i<=minLoop;i++){
            res=res*(steps-minLoop+i)/i;
        }

        return (int)res;
    }
}