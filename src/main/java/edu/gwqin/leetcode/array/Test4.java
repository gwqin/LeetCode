package edu.gwqin.leetcode.array;

/**
 * @author: gwqin
 * @date: 2019/8/14 17:27
 * @descrption:
 */
public class Test4
{
    public static void main(String[] args)
    {
        int[] ints = {2,14,18,22,22};
        System.out.println(containsDuplicate(ints));
    }

    private static boolean containsDuplicate(int[] nums) {
        if (nums.length == 2)
        {
            return nums[0] == nums[1];
        }
        quickSort(nums, 0, nums.length -1);
        for (int i = 0; i < nums.length - 1; i ++ )
        {
            if (nums[i] == nums[i + 1])
            {
                return true;
            }
        }
        return false;
    }

    private static void quickSort(int[] arr, int left, int rigth)
    {
        int pivot = 0;
        if (left < rigth)
        {
            pivot = partition(arr, left, rigth);
            quickSort(arr, left, pivot -1);
            quickSort(arr, pivot + 1, rigth);
        }
    }

    private static int partition(int[] arr, int left, int rigth)
    {
        int key = arr[left];
        while (left < rigth)
        {
            while (left < rigth && arr[rigth] >= key)
            {
                rigth--;
            }
            arr[left] = arr[rigth];

            while (left < rigth && arr[left] <= key)
            {
                left++;
            }

            arr[rigth] = arr[left];
        }
        arr[rigth] = key;
        return left;
    }
}
