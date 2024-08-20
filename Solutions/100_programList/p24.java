// 24) WAP to delete an element from array specified by user. if element is not found print a message “Element is not found” (do not take a new array)

import java.util.Arrays;

public class p24 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int element = 3;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                found = true;
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            }
        }
        arr[arr.length - 1] = 0;

        if(found){
            System.out.println("Element found and deleted.");
            System.out.println(Arrays.toString(arr));
        }
        else{
            System.out.println("Element not found.");
        }
    }
}
