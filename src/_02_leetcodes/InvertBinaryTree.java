package _02_leetcodes;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/invert-binary-tree/
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        invertTree(root.left);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        return root;
    }

    //pre

        public TreeNode invertTree1(TreeNode root) {
            if (root == null) return null;
//        System.out.println(node.element + " ");
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree1(root.left);
            invertTree1(root.right);
            return root;
        }

        //in
        public TreeNode invertTree2(TreeNode root) {
            if (root == null) return null;
//        System.out.println(node.element + " ");


            invertTree2(root.left);
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree2(root.left);
            return root;
        }

        //post
        public TreeNode invertTree3(TreeNode root) {
            if (root == null) return null;
//        System.out.println(node.element + " ");

            invertTree3(root.left);
            invertTree3(root.right);
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            return root;
        }

        //level
        public TreeNode invertTree4(TreeNode root) {
            if (root == null) return null;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {

                TreeNode poll = queue.poll();

                TreeNode temp = poll.left;
                poll.left = poll.right;
                poll.right = temp;

                if (poll.left != null) queue.offer(poll.left);
                if (poll.right != null) queue.offer(poll.right);
            }
            return root;
        }

    }

