//25 ) WAP to check weather number is present in array or not (using recursion only) and the function’s syntax is given belowInt isInArray(int a[],int m); Where int a[] is Array of integer and m is element to be searched. 
public class p25 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int m = 10;
        boolean found = isInArray(arr, m , 0);
        if (found) {
            System.out.println("Element found in array.");
        } else {
            System.out.println("Element not found in array.");
        }
    }

    public static boolean isInArray(int[] arr, int m , int index) {
        if(index == arr.length){
            return false;
        }
        if(arr[index] == m){
            return true;
        }
        return isInArray(arr, m , index + 1);
    }
}
