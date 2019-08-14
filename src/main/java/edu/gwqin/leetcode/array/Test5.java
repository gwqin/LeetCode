package edu.gwqin.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: gwqin
 * @date: 2019/8/14 18:51
 * @descrption:
 */
public class Test5
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{4,1,2,1,2};
        System.out.println(singleNumber2(arr));
    }

    /**
     * 借用map
     * @param nums
     * @return
     */
    private static int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0)
        {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
        {
            if (map.containsKey(num))
            {
                map.remove(num);
            }
            else
            {
                map.put(num, null);
            }
        }

        return map.keySet().iterator().next();
    }

    /**
     * 使用异或
     *
     * @param nums
     * @return
     */
    private static int singleNumber2(int[] nums)
    {
        if (nums == null || nums.length == 0)
        {
            return 0;
        }
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            temp = temp ^ nums[i];
        }

        return temp;
    }
}
