package projectEuler;

public class problem10 {
	/*  
	 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	 * Find the sum of all the primes below two million.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem10 test = new problem10();
		long sumPrime = 2;
		long belowNumber = 2000000;
		for (long i = 3; i < belowNumber; i+=2){
		    //just check the odds
		    if (test.isPrime(i))
		    	sumPrime+=i;
		}
		System.out.println(sumPrime);
	}

	private boolean isPrime(long n){
	    if (n%2==0){
	    	return false;
	    }

	    //if not, then just check the odds
	    for(long i=3;i*i<=n;i+=2) {
	        if(n%i==0){
	            return false;
	        }
	    }
	    return true;
	}
}
