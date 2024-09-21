public class p4 {
    public static void main(String[] args) {
        int n =5;

        for(int i=1;i<=n;i++){
            int pre = i;
            for(int j=1;j<=i;j++){
                if(j != 1){
                    pre += n-j +1;
                }
                    System.out.print(pre + " ");
            }
            System.out.println();
        }
    }
}
