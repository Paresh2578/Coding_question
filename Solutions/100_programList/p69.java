public class p69 {
    public static void main(String[] args) {
        int n = 12 , idx = 1;
        String str = "";

        while(str.length() < n){
            str += idx;
            idx++;
        }
        System.out.println(str.charAt(n-1));
    }
}
