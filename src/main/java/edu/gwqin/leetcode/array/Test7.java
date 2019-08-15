package edu.gwqin.leetcode.array;

import java.util.Arrays;

/**
 * @author: gwqin
 * @date: 2019/8/15 16:14
 * @descrption:
 */
public class Test7
{
    public static void main(String[] args)
    {
        int[] digists = new int[]{9, 9, 9};
        digists = plusOne(digists);
        System.out.println(Arrays.toString(digists));
    }
    private static int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (i >= 0)
        {
            int digit = digits[i];
            if (digit < 9)
            {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
            i--;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
