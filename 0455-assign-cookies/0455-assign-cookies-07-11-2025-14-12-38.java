class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int ng=g.length,ns=s.length;
        if(ns==0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0,count=0;

        while(i<ng && j<ns){
            if(g[i]<=s[j]){
                count++;
                i++;
                j++;
            }else j++;
        }

        return count;


    }
}