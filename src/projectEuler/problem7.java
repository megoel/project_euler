package projectEuler;

public class problem7 {
	/* By listing the first six prime numbers: 
	 * 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
	 * 
	 * What is the 10 001st prime number?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primeWanted = 10001;
		int [] prime = new int [10001];
		prime[0] = 2;
		prime[1] = 3;
		prime[2] = 5;
		prime[3] = 7;
		prime[4] = 11;
		prime[5] = 13;
		boolean going = true;
		//to keep track of index of int array & number of primes
		int i = 6;
		int nPrime = 13;
		while (going){
			nPrime+=2;
			for (int j = (i-1); j >= 0; j--){
				if (nPrime%prime[j] == 0)
					break;
				else if(nPrime%prime[j] != 0 && j == 0 ){
					prime[i] = nPrime;
					i++;
				}
			}
			if (i == primeWanted)
				going = false;
		}
		// System.out.println(prime[primeWanted-1]);
		System.out.println(nPrime);
	}

}
