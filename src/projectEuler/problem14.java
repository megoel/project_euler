package projectEuler;

public class problem14 {
	/*  
	 * What is the greatest product of four adjacent numbers in the 
	 * same direction (up, down, left, right, or diagonally) in the 20×20 grid?
	 *
	 * The following iterative sequence is defined for the set of positive integers:
	 * n → n/2 (n is even)
	 * n → 3n + 1 (n is odd)
     *	
	 * Using the rule above and starting with 13, we generate the following sequence:
     *	
	 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
	 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 
	 * 10 terms. Although it has not been proved yet (Collatz Problem), it is thought 
	 * that all starting numbers finish at 1.
     *	
	 * Which starting number, under one million, produces the longest chain?
     *	
	 * NOTE: Once the chain starts the terms are allowed to go above one million.
	 */
	//TODO: This method implementation is not complete.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem14 test = new problem14();
		// test.chainLength(13);

		long numberRequired = 1000000;
		long startingNumber = 0;
		long chain = 0;
		long longestChain = 0;
		for (long i = 2; i < numberRequired;i++){
			chain = test.chainLength(i);
			if (longestChain < chain){
				longestChain = chain;
				startingNumber = i;
			}
		}
		System.out.println("Starting number with the longest chain: " + startingNumber);
		System.out.println("With Chain Length: " + longestChain);

	}


	/*
	 * Uses the formula:
	 * n → n/2 (When n is even)
	 * n → 3n + 1 (When n is odd)
	 * until the number inputed reaches 1
	 * Param: @int number 
	 * Return: @int chain length
	 */
	private long chainLength(long number){
		long chain = 1;
		while (number != 1){
			if (number%2 == 0){
				number = number/2;
				chain++;
			}else{
				number = (3*number)+1;
				chain++;
			}
		}
		return chain;
	}

		
}
