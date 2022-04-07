package artisan.algorithm.stack;

import java.util.Stack;

/**
 * @description: 每日温度
 * https://leetcode-cn.com/problems/daily-temperatures/
 * @author: puxianfeng
 * @date: 2022/4/7 14:21
 **/
public class DailyTemperatures {
    // temperatures = [73, 74, 75, 71, 69, 72, 76, 73]
    // [1,1,4,2,1,1,0,0]

    public static int[] dailyTemperatures(int[] temperatures) {
        // 维护一个单调递增栈(栈内元素从栈底到栈顶依次减小), 存放每日温度的下标
        Stack<Integer> stack = new Stack<>();
        // 存放结果
        int[] res = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.empty() && temperatures[i] > temperatures[stack.peek()]) {
                Integer preIndex = stack.pop();
                res[preIndex] = i - preIndex;
            }
            stack.push(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        dailyTemperatures(temperatures);
    }
}
