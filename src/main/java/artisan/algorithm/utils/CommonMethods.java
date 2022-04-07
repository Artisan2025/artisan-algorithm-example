package artisan.algorithm.utils;

import artisan.algorithm.common.ListNode;

/**
 * @description: 算法通用方法
 * @author: puxianfeng
 * @date: 2022/2/24 11:10
 **/
public class CommonMethods {

    public static void main(String[] args) {
    }

    /**
     * 打印链表
     * @param head
     */
    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

}
