class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str=strs[0];

        int n=strs.length,i=1;
        while(i<n){
            int n1=str.length(),n2=strs[i].length(),j=0;

            while(j<Math.min(n1,n2)){
                if(str.charAt(j)!=strs[i].charAt(j)){
                    if(j==0) return "";
                    str=str.substring(0,j);
                    break;
                }
                j++;
            }

            i++;
            
        }

        return str;
    }
}