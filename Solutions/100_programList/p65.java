import java.util.Arrays;

public class p65 {
    public static void main(String[] args) {
        int[] arr1 = {2,4,3};
        int[] arr2 = {5,6,4};

        String str1 = "",str2="" ;
        for(int i=arr1.length-1;i>=0;i--){
            str1 += arr1[i];
        }
        for(int i=arr2.length-1;i>=0;i--){
            str2 += arr2[i];
        }

        int rev = Integer.parseInt(str1) + Integer.parseInt(str2);

        System.out.println(rev);
        int[] arr = new int[Integer.toString(rev).length()];
        int idx = 0;

        while (rev > 0) {
            arr[idx++] = rev % 10;
            rev /= 10;
        }

        System.out.println(Arrays.toString(arr));
    }
    
}
