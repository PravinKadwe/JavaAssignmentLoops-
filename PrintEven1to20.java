package LoopAssignment;

public class PrintEven1to20 {

	public static void main(String[] args) {
	
		for(int i = 1; i < 21; i++) {
			
			int reminder = i % 2;
			
			if(reminder == 0) {
				System.out.print(i + ", ");
			}
			
		}

	}

}
