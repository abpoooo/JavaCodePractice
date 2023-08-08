package _02_leetcodes._list;

import _02_leetcodes._list.ListNode;

//https://leetcode.com/problems/linked-list-cycle/description/
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        // to check cycle of linked list use 2 pivots fast and slow
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)return true;
        }

        return false;
    }
}
