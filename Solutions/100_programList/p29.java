// 29 ) WAP to find a quotient and reminder of 2 number (bigger number should be divided by lower number) and you are not allowed to use a division and quotient operator

public class p29 {
    public static void main(String[] args) {
        int a = 15;
        int b = 7;
        int q = 0;
        int r = a;
        while(r>=b){
            r -= b;
            q++;
        }
        System.out.println("Quotient : " + q);
            System.out.println("Remainder : " + r);
       
    }
}
