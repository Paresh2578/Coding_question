import java.util.*;

public class p93 {
    public static void main(String[] args) {
        String[] strs = {"eat","taan","tan","ate","nat","bat"};

        List<List<String>> list = new ArrayList<>();

        List<String> strList = new ArrayList<>();
        for(String str : strs){
            strList.add(str);
        }

        while(!strList.isEmpty()){
            String currStr = strList.get(0);

            boolean isAdd = false;

            for(int i=0;i<list.size();i++){
                String listStr = list.get(i).get(0);

                if(isValidStr(currStr , listStr)){
                    isAdd = true;
                    list.get(i).add(currStr);
                    break;
                }
            }

            if(!isAdd){
                list.add(new ArrayList<>());
                list.get(list.size()-1).add(currStr);
            }
            strList.remove(0);
        }

        System.out.println(list);
    }

    public static boolean isValidStr(String str1 , String str2){
        int i =0;
        for(i=0;i<str1.length();i++){
            int idx = str2.indexOf(str1.charAt(i));
            if(idx == -1){
                return false;
            }else{
                str1 = str1.substring(0,i) + str1.substring(i+1);
                str2 = str2.substring(0,idx) + str2.substring(idx+1);
                i = -1;
            }
        }
        return str1.length() == 0 && str2.length() == 0;
    }

}