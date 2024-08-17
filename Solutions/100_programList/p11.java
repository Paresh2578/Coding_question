// 11) WAP to find weather given number is Armstrong number is not.

public class p11 {
    public static void main(String[] args) {
        int num = 9474;

        int temp = num;
        int sum = 0, n = String.valueOf(num).length();


        while(num > 0) {
            int rem = num % 10;

            sum += Math.pow(rem, n);
            num /= 10;
        }

        if(sum == temp) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

    }
}
