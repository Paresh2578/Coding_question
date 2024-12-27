class Node{
    int val;
    Node left , right;

    Node(int val){
        this.val = val;
        left = right = null;
    }
}

class BinaryTree{
    Node root;
    BinaryTree(){
        root = null;
    }

    public Node insertNode(int val,Node root){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(val < root.val){
            root.left = insertNode(val,root.left);
        }else{
            root.right = insertNode(val,root.right);
        }
        return root;
    }

    public void inorder(Node root){
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.val + " , ");
        inorder(root.right);
    }

    public void preOrder(Node root){
        if(root == null) return;

        System.out.print(root.val + " , ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(Node root){
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " , ");
    }
}

public class p83 {
    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();

        // Insert nodes
        int[] nodes = {50, 30, 20, 40, 70, 60, 80};
        for (int node : nodes) {
           bst.root =  bst.insertNode(node,bst.root);
        }

        System.out.println("preOrder");
        bst.preOrder(bst.root);

        System.out.println("\ninorder");
        bst.inorder(bst.root);

        System.out.println("\npostOrder");
        bst.postOrder(bst.root);
    }
}
