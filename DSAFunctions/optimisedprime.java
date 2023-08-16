public class optimisedprime{
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        else{
            for(int i =2;i<=n-1;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void primeinrange(int n){
        for(int i =1;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i+ " ");
            }
        }
    }
    public static void main(String args[]){
        primeinrange(20);
    }
}