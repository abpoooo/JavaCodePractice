package _02_leetcodes._tree;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorderTraversal {
    List<Integer> res = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if (root == null) {
            return res;
        }
        for (Node i : root.children) postorder(i);

        res.add(root.val);
        return res;
    }
}
