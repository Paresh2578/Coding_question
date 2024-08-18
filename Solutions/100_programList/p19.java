//  WAP to sort an Array using Bucket sort. 

import java.util.Arrays;

public class p19 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        int n = arr.length;

        int max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int[] bucket = new int[max + 1];
        for(int i = 0; i < n; i++){
            bucket[arr[i]]++;
        }
        System.out.println(Arrays.toString(bucket));
        int index = 0;
        for(int i = 0; i < max + 1; i++){
            while(bucket[i] > 0){
                arr[index++] = i;
                bucket[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
