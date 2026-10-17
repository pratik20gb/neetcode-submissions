class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int num:prices){
            int currentProfit = num-minPrice;
            maxProfit = Math.max(currentProfit,maxProfit);
            minPrice = Math.min(num,minPrice);
        }
        return maxProfit;
    }

}
