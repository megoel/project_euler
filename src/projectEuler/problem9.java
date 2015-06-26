package projectEuler;

public class problem9 {
	//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
	//a^2 + b^2 = c^2
	//For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

	//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	//Find the product abc.

	// TODO: This solution does not work
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		double c = Math.sqrt((a*a)+(b*b));
		boolean notSum = true;
		double requiredSum = 1000*1000;
		while (notSum){
			a++;
			b++;
			if ((a+b+c) == requiredSum){
				notSum = false;
			}
			System.out.println(a+b+c);
		}
		System.out.println(a*b*c);
	}

}
