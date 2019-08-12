package edu.gwqin.leetcode.array;

/**
 * @author: gwqin
 * @date: 2019/8/12 17:47
 * @descrption: 从排序数组中删除重复项
 */
public class Test1
{

    public static void main(String[] args)
    {
        System.out.println(removeDuplicates(new int[] {1,1,2,2,3,4,5,6,7,7,7}));
    }

    /**
     * 使用快慢指针实现，初始值都是数组的第一个元素，
     * 当快指针指向的数据与慢指针不一样的时候，慢指针往后移一位，并将快指针指向的值赋给慢指针的所指向的位置
     *
     * @param nums
     * @return
     */
    private static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int number = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[number]) {
                number++;
                nums[number] = nums[i];
            }
        }

        return number + 1;
    }
}
