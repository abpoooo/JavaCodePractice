package _02_leetcodes._tree;

import _02_leetcodes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/check-completeness-of-a-binary-tree/
public class CheckCompletenessOfBinaryTree {
    //1. if it is null false, if it is not leaf and make sure there are no left or right then start loop
//2. if node left != null && node.right != null, left and right to queue
    //3. left!=null && node.right==null, node traversed later should all be leaf nodes
    //4. left == null && right == null, node traversed later should all be leaf nodes
    public boolean isCompleteTree(_02_leetcodes.TreeNode root) {
        if (root == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isLeaf = false;
        while (!queue.isEmpty()){

        }

        return false;
    }
}
