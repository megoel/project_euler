package projectEuler;

public class problem5 {
//2520 is the smallest number that can be divided 
//by each of the numbers from 1 to 10 without any remainder.

//What is the smallest positive number that is evenly 
//divisible by all of the numbers from 1 to 20?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean smallest = true;
		int start = 2520;
		while (smallest){
			start+=20;
			for (int i = 20; i > 1; i-- ){
				if (start%i != 0)
					break;
				else if (start%i == 0 && i == 2){
					smallest = false;
					System.out.println("The smallest number:" + start);
				}
			}

		}
	}

}
