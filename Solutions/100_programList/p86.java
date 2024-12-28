class TreeNode{
    int val;
    TreeNode left , right;

    public TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

class BST{
    ListNode head;

    public TreeNode sorListNode(ListNode head){
        if(head == null ) return null;

        int size = getSize(head);

        this.head = head;


        return BSTTree( 0 , size-1);
    }

    public TreeNode BSTTree(int start , int end){
        if(start > end) return null;

        int mid = (start+end)/2;

        TreeNode left = BSTTree(start, mid-1);

        TreeNode root = new TreeNode(head.val);
        root.left = left;

        head = head.next;

        TreeNode right = BSTTree(mid+1, end);

        root.right = right;

        return root;
    }

    public int getSize(ListNode head){
        int count = 0;

        while(head != null){
            count++;
           head =head.next;
        }

        return count;
    }

    public void printInorder(TreeNode root){
        if(root == null) return;

        printInorder(root.left);
        System.out.print(root.val + " , ");
        printInorder(root.right);
    }
}

public class p86 {
    public static void main(String[] args){
        ListNode head = new ListNode(-10);

        head.next = new ListNode(-3);
        head.next.next = new ListNode(0);
        head.next.next.next  = new ListNode(5);
        head.next.next.next.next = new ListNode(9);

        BST bst = new BST();

        TreeNode root = bst.sorListNode(head);

        bst.printInorder(root);


    }
}
