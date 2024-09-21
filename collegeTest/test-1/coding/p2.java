class p2{
    public static void main(String[] args) {
        int[] arr = {16,17,4,500,5,2,100,0};

        int max = arr[arr.length-1];

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] >= max){
                System.out.print(arr[i] 
                + 
            " ");
            }
            max = Math.max(max , arr[i]);
        }
    }
}