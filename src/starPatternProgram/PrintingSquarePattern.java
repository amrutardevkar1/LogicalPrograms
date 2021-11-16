package starPatternProgram;

public class PrintingSquarePattern {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{  
			if(i==1)
			{
			for(int j=1 ; j<=5; j++)
			{
				System.out.print("*");
			}
			}
			
			if((i==2)||(i>=2&&i<=4))
			{
				for(int j=1; j<=1;j++)
				{
					System.out.print("*");
				}
				
				for(int k=1;k<=3;k++)
				{
					System.out.print(" ");
				}
				
				for(int l=1; l<=1;l++)
				{
					System.out.print("*");
				}
				
			}
			
			if(i==5)
			{
				for(int k=1;k<=5;k++)
				{
					System.out.print("*");
				}
			}
			 System.out.println();
		}
	}

}
