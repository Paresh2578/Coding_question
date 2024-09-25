//WAP to find a factorial of a given integer (iterative and recursive) 

public class p4 {
    public static void main(String[] args) {
        
       System.out.println(withoutRecursive(5));
       System.out.println(withRecursive(5));
    }

    public static int  withoutRecursive(int n){
        int f=1;
        for(int i=1;i<=n;i++){
          f *= i;
        }

        return f;
  }

  public static int  withRecursive(int n){
      if(n <= 1) return 1;

      return n * withRecursive(n-1);
      
}
}