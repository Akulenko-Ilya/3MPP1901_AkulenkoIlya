 //class description
public class Primes{
    //Main method
	public static void main(String[] args) { 
      for (int n=2;n<=100;n++){  
   

              if (isPrime(n)){
                //output of prime numbers
              System.out.println(n + " prime number"); 
              }  

        }
    }

    //description of a function  that determines
    // whether an argumentis a prime
    public static boolean isPrime(int n){ 
        //if the number is divisible without a 
        //remainder, then the number is not prime
         for (int i=2;i<n;i++){
            if((n%i)==0) return false; 
          }
          //else prime
         return true;
    }
}
