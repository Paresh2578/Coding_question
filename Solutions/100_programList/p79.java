import java.util.Stack;

class p79{
    public static void main(String[] args) {
        String infix = "(a+b)*c";

        StringBuilder postfix = new StringBuilder();
        Stack<Character> s = new Stack<>();

        for(int i=0;i<infix.length();i++){
            char ch = infix.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                postfix.append(ch);
            }else if(ch == '('){
                postfix.append(ch);
            }else if(ch == ')'){
                while(!s.isEmpty() && s.peek() != '('){
                    postfix.append(s.pop());
                }
                if(!s.isEmpty() && s.peek() == '('){
                    s.pop();
                }
            }else if(ch == '+' || ch == '-' || ch == '/' || ch == '*'){
                while (!s.isEmpty() && precedence(s.peek()) > precedence(ch)) {
                    postfix.append(s.pop());
                }
                s.push(ch);
            }
        }

        while (!s.isEmpty()) {
            postfix.append(s.pop());
        }

        System.out.println(postfix);
    }

    public static int precedence(char ch){
        switch (ch) {
            case '/':
            case '*': 
            return 2;
            case '+':
            case '-' :
            return 1;

            default: return -1;
        }
    }
}