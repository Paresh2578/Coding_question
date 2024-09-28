// Given an array of N integers, and an integer K, find the number of pairs of elements in the 
// array whose sum is equal to K. 
// e.g.  
// Input: 
// N = 4, K = 6 
// arr[] = {1, 5, 7, 1} 
// Output: 2 
// Explanation:  
// arr[0] + arr[1] = 1 + 5 = 6  
// and arr[1] + arr[3] = 5 + 1 = 6. 

import java.util.Arrays;

public class p43 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        int k = 6;

        // sort arr
        Arrays.sort(arr);

        int ans = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                 if((arr[i]+arr[j]) > k) break;
                 
                 if(arr[i] + arr[j] == k) ans++;
            }
        }

        System.out.println(ans);
    }
}
