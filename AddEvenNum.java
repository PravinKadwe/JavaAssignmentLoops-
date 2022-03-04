package LoopAssignment;

public class AddEvenNum {
	
	static void AddEven(int fromValue, int toValue) {
		
		int sum = 0;
		
		for(int i = fromValue; i <= toValue; i++) {
			
			int reminder = i % 2;
			
			if(reminder == 0) {
				
				sum += i;
				
			}
			
		}
		System.out.println("Total Sum of Even number from " + fromValue+ " to " + toValue + " is = " + sum );
	}
	
	
	
	

	public static void main(String[] args) {
		
		AddEven(10,20);

	}

}
