class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        
        while(i<j){
// Get characters and move pointers if they aren't alphanumeric
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            } else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            } else {
                // Compare lowercase versions
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}