import java.util.*;

public class p67 {
    public static void main(String[] args) {
        String exp = "1+2*3/9*0";

        List<Double> digit = new ArrayList<>();
        List<Character> op = new ArrayList<>();

        for(char ch : exp.toCharArray()){
            if(Character.isDigit(ch)){
                digit.add(Double.parseDouble(String.valueOf(ch)));
            }else{
                op.add(ch);
            }
        }


        while (!op.isEmpty()) {
            char currOp = op.get(0);
            double num1 = digit.get(0) , num2 = digit.get(1);
            double ans = 0;

           switch(currOp){
             case '+' : ans = num1+num2;
             break;
             case '-' : ans = num1-num2;
             break;
             case '*' : ans = num1*num2;
             break;
             case '/' : ans = num1/num2;
             break;
           }

           // remove two number
           digit.remove(0);
           digit.remove(0);
           op.remove(0);

           // append ans
           digit.add(0, ans);
        }

        System.out.println(digit);
    }
}
