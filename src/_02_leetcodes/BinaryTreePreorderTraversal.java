package _02_leetcodes;

import _01_courses.LinkedList;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-preorder-traversal/submissions/988986701/
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversal(root,res);
        return res;
    }

    public void traversal(TreeNode root, List<Integer> list){
        if (root == null) return;
        list.add(root.val);
        traversal(root.right, list);
        traversal(root.right, list);
    }
}
