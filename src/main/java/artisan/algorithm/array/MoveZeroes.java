package artisan.algorithm.array;

/**
 * @description: 移动零
 * https://leetcode-cn.com/problems/move-zeroes/
 * @author: puxianfeng
 * @date: 2022/2/25 11:14
 **/
public class MoveZeroes {

    /**
     * 方法一：
     * 尽可能向前移动非零值，
     * 用零填充剩余空间
     * @param nums
     */
    public static void moveZeroes1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int insertPos = 0;
        for (int num: nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }


    public static void moveZeroes2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int left = 0, right = 0;
        while (right < nums.length) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }
    }
}
