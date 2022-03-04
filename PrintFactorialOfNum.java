package LoopAssignment;

public class PrintFactorialOfNum {
	
	
	static void Factorial(int n) {
		
			int sum = 1;
				
				for(int i = n; i >= 1; i-- ) {
					
					sum *= i;
					
				}
		
				System.out.println(sum);
	}
	
	

	public static void main(String[] args) {
		
		
		Factorial(5);

	}

}
