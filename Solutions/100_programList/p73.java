import java.util.*;

public class p73 {
    static int  ans = 0;
    public static void main(String[] args) {
        String bString = "001101";
        String str = "";

        for(int i=0;i<bString.length();i++){
            str+=i;
        }

        solve(str , bString , new ArrayList<>());
        System.out.println(ans);

    }

    public static void solve(String str , String bString, List<Integer> currList){
        if(currList.size() == 3){

            boolean isValid = true;
            for(int i=0;i<2;i++){
                if(currList.get(i) > currList.get(i+1)){
                    isValid = false;
                    break;
                }
                
                if(bString.charAt(currList.get(i)) == bString.charAt(currList.get(i+1))){
                    isValid =false;
                    break;
                }
            }
            if(isValid){
                System.out.println(currList);
                ans++;
            }
            return;
        }

        for(int i=0;i<str.length();i++){
            int currNum = Integer.parseInt(String.valueOf(i));
            if(currList.contains(currNum)){
                continue;
            }

            //add
            currList.add(currNum);
            solve(str,bString, currList);
            currList.remove(currList.size()-1);
        }
    }
}
