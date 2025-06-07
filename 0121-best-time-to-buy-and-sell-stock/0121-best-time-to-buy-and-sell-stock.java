class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxP=0,min=prices[0];

        for (int i=1;i<n;i++){
            if(min>prices[i]){
                min=prices[i];
            }else if(maxP<prices[i]-min){
                maxP=prices[i]-min;
            }
        }

        return maxP;
    }
}