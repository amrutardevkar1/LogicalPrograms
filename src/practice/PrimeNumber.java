package practice;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int count;
		int n=0;
		System.out.print("List of prime numbers from 1 to 100: ");
		for(int i =1; i<=100; i++)
		{
			count=0;
		  for(int j=1; j<=i; j++)
		  {
			 n = i%j;
			 if(n==0)
			 {
				 count++;
			 }
		}
		  
		  if(count==2)
		  {
			  System.out.print(i + " ");
		  }
		  
		 }
	}

}
