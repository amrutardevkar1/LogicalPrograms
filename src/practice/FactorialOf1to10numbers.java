package practice;

public class FactorialOf1to10numbers {

	public static void main(String[] args) {
		
		System.out.println("Factorial of numbers from 1 to 10: ");
		for(int i=1; i<=10; i++)
		{
			int factorial = 1;
			for(int j=i; j>=1; j--)
			{
				factorial = factorial*j;
			}
			
			System.out.print(factorial + " ");
		}
	}
}
