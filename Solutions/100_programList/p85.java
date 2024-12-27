class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class p85 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);

        root.right.left = new TreeNode(1);

        root = addNode(1, 2, root);

        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);
    }

    public static TreeNode addNode(int val, int depth, TreeNode root) {
        if (depth == 1) {
            TreeNode newNode = new TreeNode(val);
            newNode.left = root;
            return newNode;
        }

        addNodeHalper(val, depth, root, 1);
        return root;
    }

    public static void addNodeHalper(int val, int depth, TreeNode root, int currDepth) {
        if (root == null) {
            return;
        }

        if (currDepth == depth - 1) {
            TreeNode lefTreeNode = new TreeNode(val);
            TreeNode rightTreeNode = new TreeNode(val);

            lefTreeNode.left = root.left; // Attach existing left subtree
            rightTreeNode.right = root.right; // Attach existing right subtree

            root.left = lefTreeNode; // Assign new nodes
            root.right = rightTreeNode; // Assign new nodes
        } else {
            addNodeHalper(val, depth, root.left, currDepth + 1);
            addNodeHalper(val, depth, root.right, currDepth + 1);
        }
    }
}
