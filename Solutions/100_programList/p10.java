// 10 ) WAP to find a prime number between range (range should be entered by user).

public class p10 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        for(int i = a; i <= b; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {

        for(int i=2;i<n;i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
