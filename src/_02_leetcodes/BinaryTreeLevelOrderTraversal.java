package _02_leetcodes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/binary-tree-level-order-traversal/
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
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
