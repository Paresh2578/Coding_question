public class p64 {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(solve(n));
    }

    public static int solve(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}