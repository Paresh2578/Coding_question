import java.util.HashMap;
import java.util.Map;

public class p57 {
    public static int checkArray(int[] A) {
        // Check if the array is in ascending order
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[i - 1]) {
                return 0; // If not in ascending order, return 0
            }
        }

        // Count occurrences of each number
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : A) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Check if any number appears at least 3 times
        for (int count : countMap.values()) {
            if (count >= 3) {
                return 1; // If at least one number appears 3 or more times, return 1
            }
        }

        return 0; // If no number appears 3 or more times, return 0
    }

    public static void main(String[] args) {
        int[] A1 = {1, 1, 1, 2, 2};
        int[] A2 = {1, 1, 1, 3, 3, 3, 3};
        int[] A3 = {2, 2, 2, 1, 1, 1};

        System.out.println(checkArray(A1)); // Output: 0
        System.out.println(checkArray(A2)); // Output: 1
        System.out.println(checkArray(A3)); // Output: 0
    }
}
