package edu.gwqin.leetcode.array;

/**
 * @author: gwqin
 * @date: 2019/8/12 19:12
 * @descrption:
 */
public class Test2
{
    public static void main(String[] args)
    {

    }

    private static int maxProfit(int[] prices)
    {
        int max = 0;
        for (int i = 0; i < prices.length; i++)
        {
            if (prices[i] < prices[i + 1])
            {
                max += (prices[i + 1] - prices[i]);
            }
        }
        return max;
    }
}
