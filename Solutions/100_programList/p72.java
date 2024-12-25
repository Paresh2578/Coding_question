public class p72 {
    public static void main(String[] args) {
        int[] arr = {18,43,36,13,7};

        int ans = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i == j) continue;

                int num1Sum = 0 , num2Sum =0;
                int num1 = arr[i] , num2 = arr[j];

                while(num1 > 0){
                    num1Sum += num1%10;
                    num1/=10;
                }

                while(num2 > 0){
                    num2Sum += num2%10;
                    num2/=10;
                }

                if(num1Sum == num2Sum){
                    ans = Math.max(ans, (arr[i]+arr[j]));
                }
            }
        }
        System.out.println(ans);;
    }
}
