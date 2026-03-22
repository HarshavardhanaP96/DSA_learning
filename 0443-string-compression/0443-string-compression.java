class Solution {
    public int compress(char[] chars) {
        int indexAns = 0; // Where we write the result
        int i = 0;        // Where we read from
        
        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;
            
            // Count occurrences of the current character
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }
            
            // Write the character
            chars[indexAns++] = currentChar;
            
            // If count > 1, write each digit of the count
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[indexAns++] = c;
                }
            }
        }
        
        return indexAns;
    }
}