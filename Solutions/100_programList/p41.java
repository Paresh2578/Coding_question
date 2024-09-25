// You are given an integer num. Rearrange the digits of num such that its value is minimized 
// and it does not contain any leading zeros. 
// Return the rearranged number with minimal value. 
// Note that the sign of the number does not change after rearranging the digits. 
// Input: num = 310 
// Output: 103 
// Explanation: The possible arrangements for the digits of 310 are 013, 031, 103, 130, 301, 
// 310.  
// The arrangement with the smallest value that does not contain any leading zeros is 103. 


public class p41 {
    public static void main(String[] args) {
        int n =301;// 208999
        int[] arr = new int[10];

        while(n>0){
            arr[n%10]++;
            n/=10;
        }

        String str = "";
        for(int i=0;i<arr.length;i++){
               while (arr[i]>0 && i !=0){
                str = str + i;
                arr[i]--;
               }
    }

    // add Zero in secoud number
     while (arr[0]-->0){
        str = str.substring(0,1) + "0" + str.substring(1);
     }
     

            System.out.println(str);
            }
}
