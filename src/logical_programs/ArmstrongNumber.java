package logical_programs;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		ArmstrongNumber k = new ArmstrongNumber();
		k.ArmstrongNumberPrgm();
	}
	
	public void ArmstrongNumberPrgm()
	{
		for(int i=1; i<=9; i++)
		{
			int remainder=0;
			int armstrong =0;
			int number = i;
			while(number>0)
			{
				remainder = number%10;
				armstrong = armstrong+ remainder;
				number=number/10;
		    }
			if(armstrong==i)
			{
				System.out.print(" " +i);
			}
		}
		
		for(int i=10; i<=99; i++)
		{
			int remainder=0;
			int armstrong =0;
			int number = i;
			while(number>0)
			{
				remainder = number%10;
				armstrong = armstrong+ remainder*remainder;
				number=number/10;
		    }
			if(armstrong==i)
			{
				System.out.print(" " +i);
			}
		}
		
		for(int i=100; i<=999; i++)
		{
			int remainder=0;
			int armstrong =0;
			int number = i;
			while(number>0)
			{
				remainder = number%10;
				armstrong = armstrong+ remainder*remainder*remainder;
				number=number/10;
		    }
			if(armstrong==i)
			{
				System.out.print(" " +i);
			}
		}
		
		for(int i=1000; i<=9999; i++)
		{
			int remainder=0;
			int armstrong =0;
			int number = i;
			while(number>0)
			{
				remainder = number%10;
				armstrong = armstrong+ remainder*remainder*remainder*remainder;
				number=number/10;
		    }
			if(armstrong==i)
			{
				System.out.print(" " +i);
			}
		}
		
	}

}
