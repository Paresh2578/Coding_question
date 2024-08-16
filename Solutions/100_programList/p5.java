//5 WAP to find a summation of a digit of a given number. (Iterative and recursive)

public class p5 {
    public static void main(String[] args) {
        int n = 12345;
       
        summation(n);
       int sum =  summationRecursive(n);
       System.out.println(sum);
    }

    public static void summation(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }

    public static int summationRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + summationRecursive(n / 10);
    }   
}
