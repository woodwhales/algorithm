package cn.woodwhales.algorithm.linkedlist;

/**
 * @author woodwhales on 2021-08-09 13:01
 * @description 链表逆序
 * 参见：https://leetcode.com/problems/reverse-linked-list/
 *
 * 示例1：
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 *
 * 示例2：
 * Input: head = [1,2]
 * Output: [2,1]
 *
 * 示例3：
 * Input: head = []
 * Output: []
 *
 */
public class ReversedLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}


