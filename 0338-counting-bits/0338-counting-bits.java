class Solution {

    //using dp
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {

            //The number of bits in $i$ is just the number of bits in $i/2$ plus $1$ if $i$ is odd.
            //If $i$ is even: ans[i] = ans[i >> 1]
            //If $i$ is odd: ans[i] = ans[i >> 1] + 1
            // ans[i] = ans[i / 2] + (i % 2)
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}