package _02_leetcodes._tree;

import _02_leetcodes.TreeNode;

//https://leetcode.com/problems/balanced-binary-tree/description/
public class isBalanced {
    // another way with recursion without dto, choose this easier
    public boolean isBalanced(_02_leetcodes.TreeNode node){
        if (node == null) return true;

        if (Math.abs(height(node.left) -height(node.right)) > 1) return false;

        return isBalanced(node.left) && isBalanced(node.right);
    }
    private int height(TreeNode root){
        if (root == null) return 0;
        return Math.max(height(root.left), height(root.right) + 1);
    }
}
