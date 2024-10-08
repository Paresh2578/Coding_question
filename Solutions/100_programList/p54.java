import java.util.Arrays;

class p54{
    public static void main(String[] args) {
       int[] arr = {0,3,0};
       int ans = 0;


       Arrays.sort(arr);
       while (arr[0] != arr[arr.length-1]) {
            arr[0]++;
            arr[arr.length-1]--;
            ans++;

            Arrays.sort(arr);
       }

       System.out.println("ans : " + ans);

    }
}