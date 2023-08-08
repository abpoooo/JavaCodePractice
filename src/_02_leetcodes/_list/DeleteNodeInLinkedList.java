package _02_leetcodes._list;

//https://leetcode.com/problems/delete-node-in-a-linked-list/
public class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        // delete value is make the linked list to connect to next point
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
