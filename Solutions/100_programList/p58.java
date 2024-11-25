// Write a program to check weather number is happy number is not, happy number are those 
// number whose digit’s square summation eventually reaches to 1, if the sequence start 
// repeating then it is not a happy number, to store this sequence, use a dynamic data structure.
// E.g., 49 is a happy number whose sequence is 49 97 130 10 1
// E.g., 50 is not a happy number whose sequence is 50 25 29 85 89 145 42 20 4 16 37 58 89 
// it should stop when 89 is detected 2nd time and print 50 is not a happy number.

import java.util.*;

class p58{
    public static void main(String[] args) {
        int num = 50;

        List<Integer> list = new ArrayList<>();
        list.add(num);

        while(num != 1){
             num = findHappy(num);

             if(list.contains(num)) break;
             else list.add(num);
        }

        System.out.println(list);

        if(num == 1) System.out.println("It is happy number");
        else System.out.println("It is Not Happy Number");
    }

    public static int findHappy(int num){
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}