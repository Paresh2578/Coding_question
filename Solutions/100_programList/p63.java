import java.util.ArrayList;
import java.util.List;

public class p63 {
      public static void main(String[] args) {
        int[] arr = {1,2,3};

        List<List<Integer>> list = new ArrayList<>();

        findPermution(arr , new ArrayList<>() , list);
        System.out.println(list);
      }

      public static void findPermution(int[] arr , List<Integer> currList,List<List<Integer>> list ){
        if(currList.size() == arr.length){
            list.add(new ArrayList<>(currList));
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(currList.contains(arr[i])){
                continue;
            }

            //add
            currList.add(arr[i]);
            findPermution(arr, currList, list);
            
            //remove
            currList.remove(currList.size()-1);
        }
      }
}
