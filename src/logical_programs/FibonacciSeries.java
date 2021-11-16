package logical_programs;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		FibonacciSeries k = new FibonacciSeries();
		k.FibonacciSeriesPrgm();
	}

	public void FibonacciSeriesPrgm()
	{
		int number1=0;
		int number2=1;
		int number3=0;
		System.out.print(number1 + " ");
		System.out.print(number2 + " ");
		 for(int i=0; i<=20; i++)
		 {
			 number3= number1 + number2;
			 System.out.print(number3 + " ");
			 number1=number2;
			 number2=number3;
		 }
	}
}
