package projectEuler;

public class problem21 {
	/* Let d(n) be defined as the sum of proper divisors 
	 * of n (numbers less than n which divide evenly into n).
     * If d(a) = b and d(b) = a, where a ≠ b, then a and b are 
     * an amicable pair and each of a and b are called amicable numbers.

	 * For example, the proper divisors of 220 are 
	 * 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; 
	 * therefore d(220) = 284. The proper divisors of 
	 * 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

	 * Evaluate the sum of all the amicable numbers under 10000.
	 */

	// TODO: This solution does not work
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem21 test = new problem21();

		int numRequired = 10000;
		int sumOfAmicable = 0;
		for (int i = 1; i < numRequired;i++){
			if (test.isAmicable(i)){
				sumOfAmicable += i;
				System.out.println("i :" + i+ " amicableSum :" + sumOfAmicable);
			}
		}
		System.out.println("sum of all the amicable numbers under 10000 :" +   sumOfAmicable);

	}

	private boolean isAmicable(int number){
		int initialSum = 0;

		//for entered number
		if (number %2 == 0){
			for (int i = 1; i <= number/2; i++){
				if (number%i == 0){
					initialSum+=i;
				}
			}
		}else{
			for (int i = 1; i <= (number+1)/2; i++){
				if (number%i == 0){
					initialSum+=i;
				}
			}
		}

		int amicableCheck = 0;
		//for the potential amicable number
		if (initialSum %2 == 0){
			for (int i = 1; i <= initialSum/2; i++){
				if (initialSum%i == 0){
					amicableCheck+=i;
				}
			}
		}else{
			for (int i = 1; i <= (initialSum+1)/2; i++){
				if (initialSum%i == 0){
					amicableCheck+=i;
				}
			}
		}

		//d(a) = b and d(b) = a, where a ≠ b, return true
		if (amicableCheck == number && number != initialSum)
			return true;

		return false;
	}

}
