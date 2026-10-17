class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int num:prices){
            minPrice = Math.min(num,minPrice);
            int currentProfit = num-minPrice;
            maxProfit = Math.max(currentProfit,maxProfit);
        }
        return maxProfit;
    }

}
