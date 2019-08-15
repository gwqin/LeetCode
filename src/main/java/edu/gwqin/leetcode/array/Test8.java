package edu.gwqin.leetcode.array;

import java.util.Arrays;

/**
 * @author: gwqin
 * @date: 2019/8/15 16:22
 * @descrption:
 */
public class Test8
{
    public static void main(String[] args)
    {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeroes(int[] nums)
    {
        int slow = 0, fast = 0;
        while (fast < nums.length)
        {
            if (nums[fast] != 0)
            {
                nums[slow] = nums[fast];
                slow++;
                fast++;
            }
            else
            {
                fast++;
            }
        }

        for (int i = slow; i < nums.length; i++)
        {
            nums[i] = 0;
        }
    }
}
