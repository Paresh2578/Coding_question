/**
 * p56
 */
public class p56 {

    public static void main(String[] args) {
        int[] arr = {2,5,3,9,5,3};
        int n = arr.length ,  minIndex = 0 , minValue = Integer.MAX_VALUE;


        for(int i=0;i<arr.length;i++){
            int right = i , left = i+1;
            int rightSum = 0 , leftSum = 0;

            for(int j=0;j<right;j++){
                rightSum += arr[j];
            }
            for(int j=left;j<arr.length;j++){
                leftSum += arr[j];
            }


            int diff = Math.abs((rightSum/(i+1)) - ((n-i-1) == 0 ? 0 : leftSum/(n-i-1)));
            if(diff < minValue){
                minValue = diff;
                minIndex = i;
            }
        }

        System.out.println("minIndex : " + minIndex + " minValue : " + minValue);
    }
}