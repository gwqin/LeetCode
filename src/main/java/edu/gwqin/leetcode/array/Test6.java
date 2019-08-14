package edu.gwqin.leetcode.array;

import java.util.*;

/**
 * @author: gwqin
 * @date: 2019/8/14 19:33
 * @descrption:
 */
public class Test6
{
    public static void main(String[] args)
    {
        int[] intersect = intersect(new int[]{2, 4, 5}, new int[]{1, 2, 4, 5, 7, 8});
        System.out.println(Arrays.toString(intersect));
    }

    private static int[] intersect(int[] nums1, int[] nums2)
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums2[j] > nums1[i]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] result = new int[list.size()];

        for (int k = 0; k < list.size(); k++)
        {
            result[k] = list.get(k);
        }
        return result;
    }
}
