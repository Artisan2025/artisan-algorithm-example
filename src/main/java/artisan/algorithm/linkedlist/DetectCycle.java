package artisan.algorithm.linkedlist;

import artisan.algorithm.common.ListNode;

/**
 * @description: 环形链表2
 * https://leetcode-cn.com/problems/linked-list-cycle-ii/
 * @author: puxianfeng
 * @date: 2022/3/24 15:19
 **/
public class DetectCycle {
    /**
     * 解法：快慢指针
     * @param head
     * @return
     */
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                ListNode a = head;
                while (a != slow) {
                    a = a.next;
                    slow = slow.next;
                }
                return a;
            }
        }
        return null;
    }
}
