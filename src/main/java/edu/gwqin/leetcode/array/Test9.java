package edu.gwqin.leetcode.array;

import java.util.*;

/**
 * @author: gwqin
 * @date: 2019/8/15 17:39
 * @descrption:
 */
public class Test9
{
    public static void main(String[] args)
    {
        int[] nums = new int[]{3, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            int num = target - nums[i];
            if (map.containsKey(num))
            {
                return new int[]{map.get(num), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
