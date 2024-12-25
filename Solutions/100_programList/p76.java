public class p76 {
    public static void main(String[] args) {
        int[] arr = {1,3,1,2};

        int ans = 0;

        for(int i=0;i<arr.length;i++){
            int sum = 0 , min = Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++){
                min = Math.min(min , arr[j]);
                sum += arr[j];

            ans+= (sum*min);
            System.out.println(sum*min);
            }

        }

        System.out.println("ans is : "+ans);
    }
}
