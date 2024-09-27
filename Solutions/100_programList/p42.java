public class p42 {
    public static void main(String[] args) {
        int[] nums = {1,3, -1, -3,5,3,6,7};
        int k = 3;


        for(int i=0;i<nums.length-k+1;i++){
            int max = Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                max = Math.max(max, nums[j]);
            }
            System.out.print(max + " ");
        }
    }
}
