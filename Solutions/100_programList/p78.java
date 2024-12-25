import java.util.*;

public class p78 {
    public static void main(String[] args) {
        String expresion = "- + 10 * 2 3 5";

        System.out.println(solve(expresion));
    }

    public static int solve(String expres){

        String[] ch = expres.split(" ");

        Stack<Integer> s = new Stack<>();


        for(int i=ch.length-1;i>=0;i--){
            String currCh = ch[i];
            if(Character.isDigit(currCh.charAt(0))){
                s.push(Integer.parseInt(currCh));
            }else{
                int num1 = s.pop() , num2 = s.pop();
                int result = 0;

                switch (currCh) {
                    case "+": result = num1+num2; 
                        break;
                    case "-": result = num1-num2; 
                        break;
                    case "*": result = num1*num2; 
                        break;
                    case "/": result = num1/num2; 
                        break;
                    default:
                        break;
                }

                s.push(result);
            }
        }

        return s.peek();
    }
}
