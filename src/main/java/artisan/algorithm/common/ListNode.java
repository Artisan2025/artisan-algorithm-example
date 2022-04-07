package artisan.algorithm.common;

import artisan.algorithm.utils.CommonMethods;

/**
 * @description: 链表节点
 * @author: puxianfeng
 * @date: 2022/2/24 15:28
 **/
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}
