package LeetCode;

public class No121 {

}
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - min > profit) profit = prices[i] - min;
            min = Math.min(min, prices[i]);
        }
        // System.out.println(profit);
        return profit;
    }
}
