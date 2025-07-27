class Solution {
    int count=0;
    public int uniquePaths(int m, int n) {

        int i=0,j=0;
        pathCounters(i,j,m,n);
        return count;

    }

    public void pathCounters(int i, int j, int m, int n){
        if(i==m-1 && j==n-1){
            count++;
            return;
        }
        if(i==m||j==n) return;

        pathCounters(i+1,j,m,n);
        pathCounters(i,j+1,m,n);

    }
}