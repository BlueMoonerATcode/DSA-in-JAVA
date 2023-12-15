import java.util.*;

public class Buy_Sell_Stocks {

    public static int stocks(int prices[]) {
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buy_price < prices[i]) { // Profit
                int Profit = prices[i] - buy_price;
                max_profit = Math.max(max_profit, Profit);
            } else {
                buy_price = prices[i];
            }

        }

        return max_profit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(stocks(prices));
    }

}
