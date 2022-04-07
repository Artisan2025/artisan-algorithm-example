package artisan.algorithm.linkedlist;

import artisan.algorithm.common.ListNode;

/**
 * @description: 反转链表2
 * https://leetcode-cn.com/problems/reverse-linked-list-ii/
 * @author: puxianfeng
 * @date: 2022/3/29 14:30
 **/
public class ReverseList2 {

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;

        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
            cur = cur.next;
        }

        // 将cur后面的元素添加到pre的后面，即头插法
        // 1 -> 2 -> 3 -> 4 -> 5
        for (int i = 0; i < right - left; i++) {
            ListNode temp = cur.next;
            // 2 -> 4
            cur.next = cur.next.next;
            // 3 -> 2
            temp.next = cur;
            // 1 -> 3
            prev.next = temp;
            // 1 -> 3 -> 2 -> 4 -> 5

            // 第二次交换
            // 2 -> 5
            // 4 -> 3
            // 1 -> 4
            // 1 -> 4 -> 3 -> 2 -> 5
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode node = reverseBetween(head, 2, 4);
        System.out.println(node);
    }
}
