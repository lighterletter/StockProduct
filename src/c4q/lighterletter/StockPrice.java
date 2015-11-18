package c4q.lighterletter;

public class StockPrice {

    public static void main(String[] args) {

        int[] stock_prices_yesterday = {10, 7, 5, 8, 11, 9};
        int[] stock_prices_last_week = {15,14,11,7,3,2};

        System.out.println("yesterday: "+get_max_profit(stock_prices_yesterday));
        System.out.println("last week: " + get_max_profit(stock_prices_last_week));

    }

    public static int get_max_profit(int[] stock_prices_yesterday) {


        if (stock_prices_yesterday.length < 2) {
            throw new IllegalArgumentException("To compare you must have at least two prices");
        }

        int max_profit = stock_prices_yesterday[1] - stock_prices_yesterday[0];
        int min_price = stock_prices_yesterday[0];
        int potential_profit;

        for (int i = 0; i < stock_prices_yesterday.length; i++) {

            if (i == 0) {
                continue;
            }
            potential_profit = stock_prices_yesterday[i] - min_price;
            max_profit = Math.max(max_profit, potential_profit);
            min_price = Math.min(min_price, stock_prices_yesterday[i]);
        }
        return max_profit;
    }
}
