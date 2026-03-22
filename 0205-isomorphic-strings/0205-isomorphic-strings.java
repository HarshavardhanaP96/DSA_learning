class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] mapST = new int[256];
        int[] mapTS = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // If a new mapping is found
            if (mapST[c1] == 0 && mapTS[c2] == 0) {
                mapST[c1] = c2;
                mapTS[c2] = c1;
            } else if (mapST[c1] != c2 || mapTS[c2] != c1) {
                // Check for inconsistent mapping
                return false;
            }
        }
        return true;
    }
}