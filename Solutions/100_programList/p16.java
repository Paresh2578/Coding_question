// WAP to sort an Array using Bubble sort.

import java.util.Arrays;

public class p16 {
   public static void main(String[] args) {
     int[] arr = {1, 4, 2, 5, 3};

     int n = arr.length;
     for(int i = 0; i < n - 1; i++){
       for(int j = 0; j < n - i - 1; j++){
         if(arr[j] > arr[j + 1]){
           int temp = arr[j];
           arr[j] = arr[j + 1];
           arr[j + 1] = temp;
           }
           }
        }

        System.out.println(Arrays.toString(arr));
   }   
}
