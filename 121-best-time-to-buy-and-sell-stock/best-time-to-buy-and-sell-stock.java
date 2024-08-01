class Solution {
    public int maxProfit(int[] prices) {
        int sell = 0;
        int buy = 0;

        // for(int i = 0; i < prices.length; i++){
        // if(prices[buy] > prices[i]){
        // buy = i;
        // }
        // }

        // sell = buy;

        // for(int i = sell; i < prices.length; i++){
        // if(prices[sell] < prices[i]){
        // sell = i;
        // }
        // }

        // if(!(sell <= buy)){
        // return prices[sell] - prices[buy];
        // }

        int profit = 0;
        int min = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (min == prices[0] || min > prices[i]) {
                min = prices[i];
                for (int j = i + 1; j < prices.length; j++) {
                    if (prices[j] <= min) {
                        continue;
                    } else {
                        int temp = prices[j] - prices[i];
                        if (temp > profit) {
                            profit = temp;
                        }
                    }
                }
            }
        }

        return profit;
    }
}