// 30 )  WAP to convert a Decimal to Binary.

public class p30 {
    public static void main(String[] args) { 
        int n = 15;
        String s = "";
        while(n>0){
            s = (n%2) + s;
            n = n/2;
        }
        System.out.println(s);
    }
}
