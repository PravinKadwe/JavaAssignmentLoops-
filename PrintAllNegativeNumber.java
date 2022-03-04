package LoopAssignment;

public class PrintAllNegativeNumber {

	public static void main(String[] args) {
		
		int[] array = { -45, 89, -78 , 4, -6};
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] < 0) {
				System.out.print(array[i] + ", ");
			}
		}

	}

}
