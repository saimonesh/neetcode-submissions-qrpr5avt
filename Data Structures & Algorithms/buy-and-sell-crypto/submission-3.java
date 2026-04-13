class Solution {
    public int maxProfit(int[] prices) {
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
       int result =0;
       for(int i=0;i<prices.length;i++){
        min =Integer.min(prices[i],min);
        result = Integer.max(result,prices[i]-min);
       }
       return result;
    }
}
