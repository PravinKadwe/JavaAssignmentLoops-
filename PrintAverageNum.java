package LoopAssignment;

public class PrintAverageNum {
	
	
	static void AverageNum(int totalCount) {
		
		int totalSum = 0;
		
		for(int i = 1; i <= totalCount; i++) {
			totalSum += i;
		}
		
		int Avg = totalSum / totalCount ;
		
		System.out.println("Total Average = "+ Avg);
		
	}
	
	

	public static void main(String[] args) {
		
		AverageNum(5);
	}

}
