package artisan.algorithm.stack;

import java.util.Stack;

/**
 * @description: 最小栈
 * https://leetcode-cn.com/problems/min-stack/
 * @author: puxianfeng
 * @date: 2022/4/7 10:49
 **/
public class MinStack {

    Stack<Integer> stack;

    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.empty()) {
            minStack.push(val);
        } else {
            minStack.push(Math.min(minStack.peek(), val));
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
