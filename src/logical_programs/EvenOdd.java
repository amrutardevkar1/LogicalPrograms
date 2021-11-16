package logical_programs;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		EvenOdd k = new EvenOdd();
		k.EvenOddNumbers();
	}
	
	public void EvenOddNumbers()
	{
		System.out.println("Even numbers between 1 to 100 are:");
		for(int i=0; i<=100; i++)
		{
			int result = i%2;
			if(result==0)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("Odd numbers between 1 to 100 are:");
		for(int i=0; i<=100; i++)
		{
			int result = i%2;
			if(result!=0)
			{
				System.out.println(i);
			}
		}
		
	}
	}


