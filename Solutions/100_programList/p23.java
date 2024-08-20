//  WAP to enter an element at specific position into array. (Do not take a new array)

import java.util.Arrays;

public class p23 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int position = 2;
        int element = 10;
        
        // Shift elements to the right to make space     for the new element

        for (int i = arr.length - 1; i >= position; i--) {
               arr[i] = arr[i - 1];
               if(i == position){
                   arr[position] = element;
               }

        }

        System.out.println(Arrays.toString(arr));
    }
}
