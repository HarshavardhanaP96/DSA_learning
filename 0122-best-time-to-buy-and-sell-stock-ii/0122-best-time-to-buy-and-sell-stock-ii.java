class Solution {
    public int maxProfit(int[] prices) {
        int totalProfit=0;

        for(int i=0;i<prices.length-1;i++){
            int minprice=prices[i];
            int profit=0;
            while(i<prices.length-1 && prices[i]<prices[i+1] ){
                profit=prices[i+1]-minprice;
                i++;
            }

            totalProfit+=profit;
        }

        return totalProfit;
    }
}