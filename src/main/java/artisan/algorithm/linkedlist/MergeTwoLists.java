package artisan.algorithm.linkedlist;

import artisan.algorithm.common.ListNode;

/**
 * @description: 合并两个有序链表
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * @author: puxianfeng
 * @date: 2022/3/24 13:38
 **/
public class MergeTwoLists {

    /**
     * 方法一
     * @param list1
     * @param list2
     * @return
     */
    public static ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                pre.next = list1;
                list1 = list1.next;
            } else {
                pre.next = list2;
                list2 = list2.next;
            }
            pre = pre.next;
        }

        if (list1 != null) {
            pre.next = list1;
        }

        if (list2 != null) {
            pre.next = list2;
        }

        return dummy.next;
    }

    public static ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists2(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists2(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);

        ListNode listNode = mergeTwoLists1(head1, head2);
        System.out.println(listNode);
    }
}
