package _02_leetcodes._tree;
//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
public class PreorderAndInorderTraversal {

    // preorder first node is root, and in inorder the root node is imid which seperate the inorder to
    // left and right
    // we could use recursion to do the build
    //In order to make this work, we just need to pass left and right limits (ileft, iright) defining
    // the subarray of the current subtree in I,
    // as well as the index (pix) of the root node of the subtree in P.
    // and means left subtrees and right subtrees are separated by the mid of the node root
    //At each recursion, if imid = ileft, then there are no nodes in the left subtree,
    // so we shouldn't call a recursion for that side. The same applies to the right side if imid = iright.

    private int in = 0;
    private int pre = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, Integer.MIN_VALUE);
    }

    private TreeNode build(int[] preorder, int[] inorder, int stop){

        //if imid = ileft, then there are no nodes in the left subtree,
        //so we shouldn't call a recursion for that side
        if (pre >= preorder.length) return null;

        //The same applies to the right side if imid = iright.
        if (inorder[in] == stop) {
            ++in;
            return null;
        }
        TreeNode node = new TreeNode(preorder[pre++]);
        node.left = build(preorder, inorder, node.val);
        node.right = build(preorder, inorder, stop);
        return node;

    }
}
