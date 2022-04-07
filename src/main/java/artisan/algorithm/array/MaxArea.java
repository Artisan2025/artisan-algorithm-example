package artisan.algorithm.array;

/**
 * @description: 盛水最多的容器
 * https://leetcode-cn.com/problems/container-with-most-water/
 * @author: puxianfeng
 * @date: 2022/2/25 14:59
 **/
public class MaxArea {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return -1;
        }
        int maxArea = 0, left = 0, right = height.length - 1;
        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
