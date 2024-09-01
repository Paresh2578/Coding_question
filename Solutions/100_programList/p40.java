// p40 
// Given an array nums with n integers, your task is to check if it could become non-decreasing 
// by modifying at most one 
// Input: nums = [4,2,3] 
// Output: true 
// Explanation: You could modify the first 4 to 1 to get a non-decreasing array. 

public class p40 {
    public static void main(String[] args) {
        int[] arr = {4,2,3};
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n-1; i++){
            if(arr[i] > arr[i+1]){
                count++;
            }
        }
        if(count > 1){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }
}
