package _02_leetcodes;
//https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/

public class InorderAndPostorderTraversal {
    // inorder and postorder first find the root
    // then half size the left and right with the root value
    // build a tree with left size and right size then recursion
    // find the index to separate the tree
    // find the start and end both  traversal build tree
    //recursion
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }
    private TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd){
        if (inStart> inEnd || postStart > postEnd){
            return null;
        }

        int rootVal = postorder[postEnd];
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = 0;
        for (int i = inStart; i <= inEnd ; i++) {
            if (inorder[i] == rootVal){
                rootIndex = i;
                break;
            }
        }
        int leftSize = rootIndex - inStart;
        int rightSize = inEnd - rootIndex;
        root.left = buildTree(inorder, inStart, rootIndex - 1, postorder, postStart, postStart + leftSize -1);
        root.right = buildTree(inorder, rootIndex + 1, inEnd, postorder, postEnd - rightSize, postEnd - 1);
        return root;
    }
}
