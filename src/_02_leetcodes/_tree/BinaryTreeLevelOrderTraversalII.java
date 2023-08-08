package _02_leetcodes._tree;

import _02_leetcodes.TreeNode;

import java.util.*;

//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(_02_leetcodes.TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<_02_leetcodes.TreeNode> q = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();
        if (root == null) return res;

        q.offer(root);
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.remove();
                list.add(node.val);

                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            stack.push(list);
        }
        while (!stack.isEmpty()){
            res.add(stack.pop());
        }
        return res;
    }
}
