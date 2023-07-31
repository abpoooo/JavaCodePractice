package _02_leetcodes;
//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
public class FlattenBinaryTreeToLinkedList {
    // create a new temp for the next node
    // traversal the tree with a preorder ,it needed to put the right side into a linked list
    // so traversal right first
    // then put node.left to null, node. right to the new temp for recursively traversal
    // then put the temp to node
    TreeNode head = null;
    public void traversal(TreeNode node){
        if (node == null) return;
        traversal(node.right);
        traversal(node.left);

        node.left = null;
        node.right = head;
        head = node;
    }

    public void flatten(TreeNode root){
        if (root == null) return;
        traversal(root);
    }
}
