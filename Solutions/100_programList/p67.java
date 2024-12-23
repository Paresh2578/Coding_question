import java.util.*;

public class p67 {
    public static void main(String[] args) {
        String exp = "1+2*3/9*2";// 1+2*(0.5)*2

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
            char currOp = '+';
            int opIndex = -1;

            if(op.contains('/')){
                 opIndex = op.indexOf('/');
                currOp = '/';
            }else if(op.contains('*')){
                opIndex = op.indexOf('*');
                currOp = '*';
            }else if(op.contains('+')){
                opIndex = op.indexOf('+');
                currOp = '+';
            }else if(op.contains('-')){
                opIndex = op.indexOf('-');
                currOp = '-';
            }

            double num1 = digit.get(opIndex) , num2 = digit.get(opIndex+1);



            //     char currOp = op.get(0);
            //     double num1 = digit.get(0) , num2 = digit.get(1);
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

            //    // remove two number
               digit.remove(opIndex);
               digit.remove(opIndex);
               op.remove(opIndex);

           // append ans
           digit.add(opIndex, ans);
        }

        System.out.println(digit);
    }
}
