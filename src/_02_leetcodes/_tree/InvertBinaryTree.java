package _02_leetcodes._tree;

import _02_leetcodes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/invert-binary-tree/
public class InvertBinaryTree {
    public _02_leetcodes.TreeNode invertTree(_02_leetcodes.TreeNode root) {
        if (root == null) return null;

        invertTree(root.left);
        _02_leetcodes.TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        return root;
    }

    //pre

        public _02_leetcodes.TreeNode invertTree1(_02_leetcodes.TreeNode root) {
            if (root == null) return null;
//        System.out.println(node.element + " ");
            _02_leetcodes.TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree1(root.left);
            invertTree1(root.right);
            return root;
        }

        //in
        public _02_leetcodes.TreeNode invertTree2(_02_leetcodes.TreeNode root) {
            if (root == null) return null;
//        System.out.println(node.element + " ");


            invertTree2(root.left);
            _02_leetcodes.TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree2(root.left);
            return root;
        }

        //post
        public _02_leetcodes.TreeNode invertTree3(_02_leetcodes.TreeNode root) {
            if (root == null) return null;
//        System.out.println(node.element + " ");

            invertTree3(root.left);
            invertTree3(root.right);
            _02_leetcodes.TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            return root;
        }

        //level
        public _02_leetcodes.TreeNode invertTree4(_02_leetcodes.TreeNode root) {
            if (root == null) return null;

            Queue<_02_leetcodes.TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {

                _02_leetcodes.TreeNode poll = queue.poll();

                TreeNode temp = poll.left;
                poll.left = poll.right;
                poll.right = temp;

                if (poll.left != null) queue.offer(poll.left);
                if (poll.right != null) queue.offer(poll.right);
            }
            return root;
        }

    }

