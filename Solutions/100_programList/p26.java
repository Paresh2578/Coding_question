// 26 )  WAP to convert a Binary to Decimal. 

public class p26 {
    public static void main(String[] args) {
        String bNum = "111.01";

        double dNum = 0.0;

        String[] str = bNum.split("\\.");

        for(int i=0;i<str[0].length();i++){
            dNum += ((str[0].charAt(str[0].length()-i-1) - '0') * Math.pow(2 , i));
        }

        for(int i=0;i<str[1].length();i++){
            dNum += ((str[1].charAt(i) - '0') / (Math.pow(2, i+1)));
        }

        System.out.println(dNum);
    }
}
