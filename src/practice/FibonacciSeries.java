package practice;
public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		System.out.println("This is main");
		int number1=0;
		int number2 =1;
		int number3=0;
		System.out.print(number1 + " ");
		System.out.print(number2 + " ");
		
		for(int i =0; i<20; i++)
		{
			number3= number1+number2;
			System.out.print(number3+ " ");
			number1= number2;
			number2= number3;
		}
				
	 
		system();
	}

	
	public static void system()
	{
		System.out.println("This is system method");
		int a=10;
		int b=20;
		
		System.out.println(a+b + "result is");
		System.out.println("result is:" + a+b);
	}
}
