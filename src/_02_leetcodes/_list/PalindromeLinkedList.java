package _02_leetcodes._list;

import _02_leetcodes._list.ListNode;

//https://leetcode.com/problems/palindrome-linked-list/
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        /**
         * /
         * 思路 1.借助快慢指针找到list终点
         * 2.后半段反转
         * 3.设置两个指针两个指针（头尾）分别让两个纸扎嗯向中间靠近， 进行回文判断
         * 4.最后恢复方向（再次反转后半部分）
         *
         */
        ListNode middleNode = getMid(head);
        ListNode rightNode = reverseList(middleNode.next);

        ListNode oldRightNode = rightNode;
        ListNode leftNode = head;
        boolean isPalindrome = true;

        while (rightNode != null){
            if (leftNode.val != rightNode.val){
                isPalindrome = false;
                break;
            }
            leftNode = leftNode.next;
            rightNode = rightNode.next;
        }

        // change direction again
        reverseList(oldRightNode);
        return isPalindrome;
    }

    public ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast.next != null && fast != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode newHead = null;
        while (head != null){
            ListNode temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        return newHead;
    }
}
