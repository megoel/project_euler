package projectEuler;

public class problem6 {
	/* The sum of the squares of the first ten natural numbers is,
	 * 1^2 + 2^2 + ... + 10^2 = 385
	 * The square of the sum of the first ten natural numbers is,
	 *
	 *
	 * (1 + 2 + ... + 10)2 = 552 = 3025
	 * Hence the difference between the sum of the squares 
	 * of the first ten natural numbers and the square of the sum 
	 * is 3025 − 385 = 2640.

	 * Find the difference between the sum of the squares of the 
	 * first one hundred natural numbers and the square of the sum.
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumSquare = 0;
		int squaredSum = 0;
		for(int i = 1; i < 101; i++){
			sumSquare += (i*i);
			squaredSum += i;
		}
		squaredSum = squaredSum*squaredSum;
		int difference = squaredSum - sumSquare;
		System.out.println(difference);
	}

}
