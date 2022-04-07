package artisan.algorithm.linkedlist;

import artisan.algorithm.common.ListNode;

/**
 * @description: 反转链表
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * @author: puxianfeng
 * @date: 2022/2/24 11:39
 **/
public class ReverseList {
    /**
     * 方法一
     * 解题思路：递归
     * @param head 头节点
     * @return cur
     */
    public static ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = reverseList1(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }

    /**
     * 方法二
     * 解题思路：快慢指针
     * 在遍历链表时，将当前节点的next 指针改为指向前一个节点。由于节点没有引用其前一个节点，因此必须事先存储其前一个节点。
     * 在更改引用之前，还需要存储后一个节点。最后返回新的头引用。
     * @param head 头节点
     * @return cur
     */
    public static ListNode reverseList2(ListNode head) {
        //  null  1 -> 2 -> 3 -> 4 -> 5
        //  prev  cur
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            // 1.先将下一个节点存储
            ListNode temp = cur.next;
            // 2.当前节点指向pre(指针反转)
            cur.next = prev;
            // 3. 移动prev到当前节点
            prev = cur;
            // 4. 移动当前节点指向下一个节点
            cur = temp;
        }
        return prev;
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

        ListNode node = reverseList1(head);
        System.out.println(node);
    }
}
