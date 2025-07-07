class Solution {
    public double myPow(double x, int n) {
        double res=1.00000;

        long i=n<0?(-1*n):n;

        while(i>0){
            if(i%2==0){
                x=x*x;
                i/=2;
            }else{
                res=res*x;
                i--;
            }
        }
  

        return n>0?res:1/res;
    }
}