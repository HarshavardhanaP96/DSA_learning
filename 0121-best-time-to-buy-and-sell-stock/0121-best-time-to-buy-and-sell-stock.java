class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit= 0;
        int min= Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            int profit=prices[i]-min;

            maxProfit=Math.max(maxProfit,profit);
        }

        return maxProfit;
    }
}