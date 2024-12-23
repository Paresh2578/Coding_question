import java.util.*;

class p62 {
    public static void main(String[] args) {
        String str = "abc";

        List<String> list = new ArrayList<>();

        findPermution(list,str , "" );

        System.out.println(list);

        list.sort((a,b) -> a.compareTo(b));

        System.out.println(list);

        int idx = list.indexOf(str);

        if(idx == list.size()-1){
            System.out.println("Not possible");
        }else{
            System.out.println(list.get(idx+1));
        }

    }  

    
    public static void findPermution(List<String>  list , String str , String current){
        if(current.length()  == str.length()){
            list.add(current);
            return;
        }

        for(int i=0;i<str.length();i++){
            if(current.contains(str.charAt(i)+"")){
                continue;
            }
            // add
            current = current + str.charAt(i);
            findPermution(list, str, current);
            // remove
            current = current.substring(0, current.length()-1);
        }
    }

}
