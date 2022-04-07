package artisan.algorithm.linkedlist;

import java.util.HashMap;

/**
 * @description: 复制带随机指针的链表
 * https://leetcode-cn.com/problems/copy-list-with-random-pointer/
 * @author: puxianfeng
 * @date: 2022/3/29 16:51
 **/
public class CopyRandomList {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node cur = head;
        HashMap<Node, Node> map = new HashMap<Node, Node>();
        while (cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }

        cur = head;
        while (cur != null) {
            Node curNew = map.get(cur);
            curNew.next = map.get(cur.next);
            curNew.random = map.get(cur.random);

            cur = cur.next;
        }

        return map.get(head);
    }

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
