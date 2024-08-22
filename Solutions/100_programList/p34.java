public class p34 {
    class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    p34() {
        root = null;
    }

    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }

    void printLeafNodes() {
        printLeafNodesRec(root);
    }

    void printLeafNodesRec(Node node) {
        if (node == null)
            return;

        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }

        if (node.left != null)
            printLeafNodesRec(node.left);

        if (node.right != null)
            printLeafNodesRec(node.right);
    }

    public static void main(String[] args) {
        p34 bst = new p34();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Leaf nodes of the BST:");
        bst.printLeafNodes();
    }
}
