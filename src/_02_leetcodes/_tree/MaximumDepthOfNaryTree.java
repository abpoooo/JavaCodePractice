package _02_leetcodes._tree;

import _02_leetcodes._tree.Node;

//https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
public class MaximumDepthOfNaryTree {
    //recursively do the maxDepth with the children, and max needs to add the root height
    public int maxDepth(_02_leetcodes.Node root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        for (_02_leetcodes.Node c : root.children) {
            max = Math.max(max, maxDepth(c));
        }
        return max + 1;
    }
}
