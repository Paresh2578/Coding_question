// patten 1
//   1
// A   B
//2 3  4

// pattern 2
//     ******
//      ****
//       **
//        *

// pattern 3
//     *********
//     ***  ***
//     **    **
//     *      *

public class p21 {
    public static void main(String[] args) {
        // pattren -1
        int n = 5;
        int num = 1;
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for(int k=n-i;k>= 1;k--){
              System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                if(i%2 == 0){
                    System.out.print(ch + " ");
                    ch++;
                }else{
                    System.out.print(num + " ");
                    num++;
                }
            }
            System.out.println("");
        }

        // pattren 2
        for(int i=n;i>=1;i--){
            for(int k=n-i;k>= 1;k--){
                System.out.print(" ");
              }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        // pattren 3
        for(int i=1;i<=n;i++){
            for(int k=n-i;k>= 1;k--){
                System.out.print("*");
              }
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for(int k=n-i;k>= 1;k--){
                System.out.print("*");
              }
            System.out.println("");
        }
    }

    }
