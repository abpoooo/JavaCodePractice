package _02_leetcodes;


//https://leetcode.com/problems/remove-linked-list-elements/description/
public class RemoveLinkedListElements {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode removeElements(ListNode head, int val){
        // dummy node set a node before head
        ListNode temp = new ListNode(0, head);
        ListNode current = temp;

        while (current.next != null){
            if (current.next.val == val){
                current.next = current.next.next;
            }
            else current = current.next;
        }
        return temp.next;
    }
}
