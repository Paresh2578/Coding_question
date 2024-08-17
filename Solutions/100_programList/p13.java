// 13)  WAP to find a Multiplication of 2 Matrix (dimension and value should be entered by user)

import java.util.*;

public class p13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        System.out.println("Enter the first matrix: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the second matrix: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        
        

        int[][] result = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                result[i][j] = arr1[i][j] * arr2[i][j];
            }
        }

        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));
        System.out.println("result ");
        System.out.println(Arrays.deepToString(result));

    }
}
