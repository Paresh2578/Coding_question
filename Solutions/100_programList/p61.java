import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

public class p61 {
    private Map<Integer, Integer> frequencyMap;
    private int maxFrequency;

    // build Tree to arr
    // public TreeNode buiTreeNode(int[] arr , int left , int right){
    //     if(left > right) return null;

    //     int mid = left + (right -left)/2;
    //     TreeNode root = new TreeNode(arr[mid]);
    //     root.left = buiTreeNode(arr, left, mid-1);
    //     root.right = buiTreeNode(arr, mid+1, right);

    //     return root;
    // }

    public List<Integer> findMode(TreeNode root) {
        frequencyMap = new HashMap<Integer,Integer>();
        maxFrequency = 0;

        // Perform in-order traversal to populate the frequency map
        inOrderTraversal(root);

        // Collect the elements with the maximum frequency
        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                modes.add(entry.getKey());
            }
        }

        // Convert the list to an array and return
        return modes;
    }

    private void inOrderTraversal(TreeNode node) {
        if (node == null) return;

        // Traverse left subtree
        inOrderTraversal(node.left);

        // Update frequency map and max frequency
        frequencyMap.put(node.val, frequencyMap.getOrDefault(node.val, 0) + 1);
        maxFrequency = Math.max(maxFrequency, frequencyMap.get(node.val));

        // Traverse right subtree
        inOrderTraversal(node.right);
    }

    // Example usage
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);

        p61 solution = new p61();
        System.out.println(solution.findMode(root)); // Output: [2]
    }
}
