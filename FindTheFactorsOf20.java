package LoopAssignment;

public class FindTheFactorsOf20 {
	
	static void FindFactors(int num) {
		
		System.out.print("Factors of number "+num+" are = ");
		for(int i = 1; i <= num; ++i) {
			int reminder = num % i;
			 
			
			if(reminder == 0 && i < 10) {
				System.out.print(i+", ");
			}
		}
		
	}
	

	public static void main(String[] args) {
		
		FindFactors(20);
	}

}
