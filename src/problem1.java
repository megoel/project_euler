package projectEuler;

public class problem1 {

	//Find the sum of all the multiples of 3 or 5 below 1000.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get all multiples of 3 and 5
		int sum = 0;		
		for (int i=0; i < 1000; i++){
			
			if (i%3==0 || i%5==0){
				sum = i + sum;
			}
		}
		System.out.println(sum );
	}

}

