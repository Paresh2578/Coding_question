// WAP to sort an Array using Selection sort

import java.util.Arrays;

public class p18 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
