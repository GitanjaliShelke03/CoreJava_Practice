public class PrimeNumberOptimized{
public static void main(String[] args){
 
  // 2 is the only even prime number
  // All other even numbers are not prime
 System.out.println(2);

 // Loop through only ODD numbers starting from 3 till 100
 // num += 2 skips all even numbers 
		
  for (int num = 3; num <= 100; num += 2) {
	 
	 //Assumed number is prime 
    boolean isPrime = true;

         // Check divisibility only till sqrt(num)
         // i * i <= num is equivalent to i <= sqrt(num)
         // i += 2 skips even divisors (another optimization)
		 
      for (int i = 3; i * i <= num; i += 2) {
         if (num % i == 0) {
			 
			// If num is divisible by i,
            // then num is NOT a prime number
			
              isPrime = false;   // mark as non-prime
              break;         // exit loop early to save time
           }
     }

    if (isPrime)  // If no divisor was found, number is prime
        System.out.println(num);
   }
  }
 }