package _02_leetcodes._list;

import _02_leetcodes._list.ListNode;

//https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        //recursion assume reverseList is already done

        if (head == null) return head;

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
