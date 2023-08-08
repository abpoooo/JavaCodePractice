package _02_leetcodes._tree;

import _02_leetcodes.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/binary-tree-level-order-traversal/
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(_02_leetcodes.TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        Queue<_02_leetcodes.TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        if (root == null) return res;

        while (!queue.isEmpty()){
            List<Integer> inner = new ArrayList<>();
            TreeNode poll = queue.poll();
            inner.add(poll.val);
            if (poll.left != null)queue.offer(poll.left);
            if (poll.right != null)queue.offer(poll.right);

            res.add(inner);
        }
        return res;
    }
}
