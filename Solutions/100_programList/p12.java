// 12)  WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value should be taken from user (Note that you are not allowed to use an array for this)

import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        int n = 5;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < n; i++) {
            System.out.println("Enter number : ");
            int num = sc.nextInt();
            
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
            sum += num;
            }
            double average = (double) sum / n;
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
            System.out.println("Average: " + average);
            
    }
}