public class p71 {
    static int ans = 0;

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1}; // Example input
        int target = 3; // The target sum

        // Start solving with index 0 and an initial sum of 0
        solve(arr, target, 0, 0);
        System.out.println(ans); // Output the result
    }

    // Backtracking method to find all valid combinations
    public static void solve(int[] arr, int target, int index, int sum) {
        // Base case: If we've processed all elements
        if (index == arr.length) {
            // If the sum matches the target, increment the answer
            if (sum == target) {
                ans++;
            }
            return;
        }

        // Include the current number with a "+" sign
        solve(arr, target, index + 1, sum + arr[index]);

        // Include the current number with a "-" sign
        solve(arr, target, index + 1, sum - arr[index]);
    }
}
