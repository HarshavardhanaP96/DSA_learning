class Solution {
    public boolean isAnagram(String s, String t) {

        int n1=s.length(),n2=t.length(),i=0;

        if(n1!=n2) return false;

        int[] arr1=new int[26];
        int[] arr2=new int[26];

        for(int j=0;j<26;j++){
            arr1[j]=0;
            arr2[j]=0;
        }

        while(i<n1){
            arr1[(int)s.charAt(i)-97]++;
            arr2[(int)t.charAt(i)-97]++;
            i++;
        }

        for(int j=0;j<26;j++){
            if(arr1[j]!=arr2[j]) return false;
        }

        return true;
    }
}