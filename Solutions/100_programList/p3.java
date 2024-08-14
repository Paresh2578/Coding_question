//WAP to find a Factor of a given number (iterative and recursive) 

class p3{
    public static void main(String[] args) {
        int n = 10;

        withoutRecursive(n);
        withRecursive(n, 1);
    }

    public static void  withoutRecursive(int n){
          for(int i=1;i<=n;i++){
            if(n%i == 0){
                System.out.println(i);
            }
          }
    }

    public static void  withRecursive(int n, int i){
        if(i == n+1) return ;

        if(n%i == 0){
            System.out.println(i);;
        }
 
         withRecursive(n, i+1);
        
  }
}