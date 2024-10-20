package Leetcode_Problems;
public class BestTimeToSellAndBuyStock {
    static int maxProfit(int prices[], int n)
    {
        int buy = prices[0], max_profit = 0;
        for (int i = 1; i < n; i++) {

            // Checking for lower buy value
            if (buy > prices[i])
                buy = prices[i];

            // Checking for higher profit
            else if (prices[i] - buy > max_profit)
                max_profit = prices[i] - buy;
        }
        return max_profit;
    }
    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        int profit = maxProfit(arr, arr.length);
        System.out.println(profit);
    }
}
