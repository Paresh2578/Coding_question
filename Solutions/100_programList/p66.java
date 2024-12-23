import java.util.*;

public class p66 {
    public static void main(String[] args) {
        int[] arr = {1,3,1,2};
        int k = 3;

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int diff = Math.abs(arr[i]-arr[j]);
                if(!list.contains(diff)){
                    list.add(Math.abs(arr[i]-arr[j]));
                }
            }
        }

        Collections.sort(list);

        System.out.println(list.get(k-1));
    }
}
