package artisan.algorithm.binarysearch;

/**
 * @author puxianfeng
 * @description
 * @date 2021/12/6 6:18 下午
 */
public class BinarySearch {

    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid;
            } else if (target < nums[mid]) {
                end = mid;
            } else {
                end = mid;
            }
        }

        if (target == nums[end]) {
            return end;
        }

        if (target == nums[start]) {
            return start;
        }

        return -1;
    }
}
