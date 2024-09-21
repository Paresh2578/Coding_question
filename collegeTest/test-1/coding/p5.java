class p5{
    public static void main(String[] args) {
        int n =6;
        boolean isUgly = true;
  
        for(int i=2;i<= n;i++){
            if(n%i == 0){
                if(isPrime(i)){
                    if(i != 2 && i != 3 && i !=5){
                       isUgly = false;
                       break;
                    }
                }
            }
        }
  
            if(isUgly){
                System.out.println("is ugly num");
            }else{
                System.out.println("is not ugly number");
            }
       
    }
  
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
  
        return true;
    }
  }