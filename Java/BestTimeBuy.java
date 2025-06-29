import java.util.Arrays;

public class BestTimeBuy {
    public int maxProfit(int[] prices)
    {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++)
        {
            if(prices[i] < minPrice)
            minPrice = prices[i];
            if(prices[i] - minPrice > maxProfit)
            maxProfit = prices[i] - minPrice; 
        }
        return maxProfit;
    }
    public static void main(String args[])
    {
        int[] nums = {7, 1, 5, 3, 6, 4};
        BestTimeBuy obj = new BestTimeBuy();
        int profit = obj.maxProfit(nums); // Corrected line

        System.out.println("The array is: " + Arrays.toString(nums));
        System.out.println("The maximum profit is: " + profit);
    }
}
