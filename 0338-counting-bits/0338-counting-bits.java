class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        
        for (int i = 0; i <= n; i++) {
            int ele = i;
            int count = 0;
            while (ele > 0) {
                ele &= (ele - 1); // Clears the lowest set bit
                count++;
            }
            ans[i] = count;
        }
        
        return ans;
    }
}