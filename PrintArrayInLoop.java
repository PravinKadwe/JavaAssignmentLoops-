package LoopAssignment;

public class PrintArrayInLoop {

	public static void main(String[] args) {
		
		int[] array = {10,20,30,40,50};
		
		for(int i = 0; i < array.length; i++) {
			
			int sum = 100 + array[i];
			
			System.out.print(sum + ", ");
			
		}

	}

}
