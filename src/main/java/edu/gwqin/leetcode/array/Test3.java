package edu.gwqin.leetcode.array;

import java.util.Arrays;

/**
 * @author: gwqin
 * @date: 2019/8/14 14:14
 * @descrption:
 */
public class Test3
{
    public static void main(String[] args)
    {
        /**

         11939
         */
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate3(array, 3);
        System.out.println(Arrays.toString(array));
    }

    /**
     * for循环，每次循环移动一位
     *
     * @param nums
     * @param k
     */
    private static void rotate1(int[] nums, int k)
    {
        if (k == 0 || (k = k % nums.length) == 0)
        {
            return;
        }
        for (int j = 0; j < k; j++)
        {
            int numTail = nums[nums.length - 1];
            int numHead = nums[0];
            nums[0] = numTail;
            for (int i = nums.length - 1; i > 0; i--)
            {
                nums[i] = nums[i - 1];
            }
            nums[1] = numHead;
        }
    }

    /**
     * 三次旋转
     *
     * @param nums
     * @param k
     */
    private static void rotate2(int[] nums, int k)
    {
        int length = nums.length;
        if (k == 0 || (k = k % length) == 0)
        {
            return;
        }
        reverseArray(nums, 0, length - k - 1);
        reverseArray(nums, length - k, length - 1);
        reverseArray(nums, 0, length - 1);
    }

    /**
     * 旋转数组
     * <p>
     * 例如：
     * array = [1, 2, 3, 4, 5, 6]
     * start = 1
     * end = 4
     * 旋转后结果为
     * array = [4, 3, 2, 1, 5, 6]
     *
     * @param array
     * @param start
     * @param end
     */
    private static void reverseArray(int[] array, int start, int end)
    {
        while (start < end)
        {
            int temp = array[start];
            array[start++] = array[end]; // 交换位置后start加1
            array[end--] = temp; // 交换位置后end减1
        }
    }

    private static void rotate3(int[] nums, int k)
    {
        int length = nums.length;
        if (k == 0 || (k = k % length) == 0)
        {
            return;
        }

        int count = 0; // 移动次数
        int index;
        int tempi;
        int tempk;
        // 最多移动k次
        for (int i = 0; i <= k; i++)
        {
            if (count >= length)
            {
                break; // 移动次数超过数组总长度时说明每个元素都已经移动过一次
            }
            index = i;
            tempi = nums[i];
            while ((index + k) % length != i)
            {
                tempk = nums[(index + k) % length];
                nums[(index + k) % length] = tempi;
                index = (index + k) % length;
                tempi = tempk;
                count++;
            }
            nums[i] = tempi;
            count++;
        }
    }

}
