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

    public void deleteNode(int val){
        root = deleteFun(val,root);
    }

    public Node deleteFun(int val, Node root){
        if(root == null) return root;

        if(val < root.val){
            root.left = deleteFun(val, root.left);
        }else if(val > root.val){
            root.right = deleteFun(val, root.right);
        }else{
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            root.val = minVal(root.right);
            root.right = deleteFun(root.val, root.right);
        }
        return root;
    }

    public int minVal(Node root){
        int ans = root.val;
        while (root.left != null) {
            ans = root.left.val;
            root = root.left;
        }

        return ans;
    }

    public void inorder(Node root){
        if(root == null) return;

        inorder(root.left);
        System.out.println("value is : "+root.val);
        inorder(root.right);

    }
}


class p82{
    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();

        // Insert nodes
        int[] nodes = {50, 30, 20, 40, 70, 60, 80};
        for (int node : nodes) {
           bst.root =  bst.insertNode(node,bst.root);
        }


        System.out.println("Inorder traversal of the BST:");
        bst.inorder(bst.root);

        // Delete nodes
        System.out.println("\n\nDeleting 20");
        bst.deleteNode(20);
        System.out.println("Inorder traversal after deleting 20:");
        bst.inorder(bst.root);

        System.out.println("\n\nDeleting 30");
        bst.deleteNode(30);
        System.out.println("Inorder traversal after deleting 30:");
        bst.inorder(bst.root);

        System.out.println("\n\nDeleting 50");
        bst.deleteNode(50);
        System.out.println("Inorder traversal after deleting 50:");
        bst.inorder(bst.root);
    }
}