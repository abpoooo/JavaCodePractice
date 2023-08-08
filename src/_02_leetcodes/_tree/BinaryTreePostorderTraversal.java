package _02_leetcodes._tree;

import _01_courses.LinkedList;
import _02_leetcodes.TreeNode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-postorder-traversal/
public class BinaryTreePostorderTraversal {
    public void traversal(_02_leetcodes.TreeNode root, List<Integer> list){
        if (root == null) return;
        traversal(root.left, list);
        traversal(root.right, list);
        list.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversal(root, res);
        return res;
    }
}
