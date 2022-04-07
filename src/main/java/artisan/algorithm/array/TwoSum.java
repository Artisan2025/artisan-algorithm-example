package artisan.algorithm.array;

import java.util.Arrays;

/**
 * @description: 两数之和
 * https://leetcode-cn.com/problems/two-sum/
 * @author: puxianfeng
 * @date: 2022/2/25 16:23
 **/
public class TwoSum {
    public static void main(String[] args) {

    }
    public static int[] twoSum(int[] nums, int target) {
        int[] res = {-1, -1};
        if (nums == null || nums.length == 0) {
            return res;
        }

        /**
         *
         */
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return res;
    }
}
