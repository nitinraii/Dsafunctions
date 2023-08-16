public class primefunction{
    public static void prime(int n){
      
        if(n==2){
            System.out.println("Number is prime");
        }
        else{
            boolean isPrime = true;
            for(int i =2;i<=n-1;i++){
                if(n%i==0){
                    isPrime = false;
                }
               
            }
            if(isPrime == true){
                System.out.println("Number is prime.");
            }
            else{
                System.out.println("Number is not prime");
            }

            

        }
        return ;
        
    }
    public static void main(String args[]){
        prime(12);
    }
}
    

    