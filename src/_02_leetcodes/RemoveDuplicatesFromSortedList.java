package _02_leetcodes;
//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        // set a temp node of the head to do the function
        ListNode temp = head;
        if (temp == null){
            return head;
        }
        while (temp.next != null){
            if (temp.val == temp.next.val){
                temp.next = temp.next.next;
            }
            else temp = temp.next;
        }
        return temp;
    }
}
