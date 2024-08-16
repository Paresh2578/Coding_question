// WAP to find a total odd and total even digit of a given number. 

public class p8 {
    public static void main(String[] args) {
        int n  = 12345;
        int odd = 0, even = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem % 2 == 0) {
                even++;
            }else{
                odd++;
            }  
            
            n /= 10;
        }

        System.out.println("odd : "+ odd + " even : "+ even);
    }
}
