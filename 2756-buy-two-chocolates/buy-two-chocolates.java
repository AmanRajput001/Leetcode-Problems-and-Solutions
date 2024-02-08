class Solution {
    public int buyChoco(int[] prices, int money) {
        int sum = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
            for(int j = i+1; j < prices.length; j++){
                if( (prices[i] + prices[j]) < sum){
                    sum = (prices[i] + prices[j]);
                }
            }
        }

        if((money - sum) >= 0){
            return (money - sum);
        }

        return money;
    }
}