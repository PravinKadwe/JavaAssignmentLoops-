package LoopAssignment;

public class PrintCountOddNum {

	public static void main(String[] args) { 
		
		int j = 0;
		
		for(int i = 50; i <= 100; i++) {
			
			int reminder = i % 2;
			
			if(reminder != 0) {
				j++;
			}
			
		}
		
		System.out.println("Count of Odd Numbers from 50 to 100 is = " + j);

	}

}
