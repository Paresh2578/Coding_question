// 9) WAP to find whether a number is Odd or Even without using a % operator.

// Explanation:
// The bitwise AND operator (&) is used here to check the last bit of the number.
// If the last bit of the number is 0, the number is even.
// If the last bit is 1, the number is odd.
// This method works because in binary:

// Even numbers end in 0.
// Odd numbers end in 1.

public class p9 {
    public static void main(String[] args) {
        int num = 14;


        if((num & 2) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }   
}
