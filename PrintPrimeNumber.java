package LoopAssignment;

public class PrintPrimeNumber {
	
	
	static void checkPrime(int n){ 
		
		  int i,m=0,flag=0;   
		  
		  m=n/2;    
		  
		  if(n != 0||n != 1){  
			  
			  for(i=2;i<=m;i++){     
				  
				    if(n%i==0){    
				    	
				     flag=1;      
				          
				    }
				   }
			  
			  if(flag==0){ 
				  
				  System.out.print(n+", "); 
				  
				  }  
			  
		  }
		  
		}  

	public static void main(String[] args) {
		
		
		
		for(int num = 2; num <= 10; num++) {
			
			checkPrime(num); 
			
		}

	}

}
