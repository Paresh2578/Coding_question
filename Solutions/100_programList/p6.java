// WAP to find a Fibonacci series up to n terms (n is entered by user) (iterative and recursive)

import java.util.*;


public class p6 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n =5;
       
        fibonacci(n);
        System.out.println();

        for(int i=0;i<n;i++){
            System.out.print(fibonacciRecursive(i)+" ");
        }
    }

    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i=0;i<n-2;i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }


}
