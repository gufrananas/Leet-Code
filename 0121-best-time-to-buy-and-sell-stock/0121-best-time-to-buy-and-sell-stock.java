class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int minp=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minp=Math.min(minp,prices[i]);
            int p=prices[i]-minp;
            maxp=Math.max(maxp,p);
        }
    return maxp;
    }
}