// 39 ) Given an array, rotate the array to the right by k steps, where k is non-negative. 
// Example 1: 
// Input: nums = [1,2,3,4,5,6,7], k = 3 
// Output: [5,6,7,1,2,3,4] 
// Explanation: 
// rotate 1 step to the right: [7,1,2,3,4,5,6] 
// rotate 2 steps to the right: [6,7,1,2,3,4,5] 
// rotate 3 steps to the right: [5,6,7,1,2,3,4] 

import java.util.Arrays;

class p39{
   public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7};
    int k = 3;
    int n = arr.length;
    int[] temp = new int[n];
     
    for(int i = 0; i < n; i++){
        // temp[(i + k) % n] = arr[i];
        if(i+k >= n){
            temp[i+k-n] = arr[i];
        }
        else{
            temp[i+k] = arr[i];
        }
    }
    for(int i = 0; i < n; i++){
        arr[i] = temp[i];
    }
    System.out.println(Arrays.toString(arr));
   }
}