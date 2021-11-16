package starPatternProgram;

import java.util.Scanner;

public class ButterflyPattern {
	
	public static void main(String[] args) {
		
		ButterflyPattern k = new ButterflyPattern();
		k.ButterflyPatternPrgm();
	}
	
	public void ButterflyPatternPrgm()
	{
		System.out.println("Enter any number");
	    Scanner scan = new Scanner(System.in);
		int col= scan.nextInt();
		int n=col/2;
		if((col%2)==0)
		{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			
			for(int k=1; k<=col-2*i; k++)
			{
				System.out.print(" ");
			}
			
			for(int l=1; l<=i; l++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
			
			for(int i=1; i<=n-1; i++)
			{
				for(int j=1; j<=n-i; j++)
				{
					System.out.print("*");
				}
				
				for(int k=1; k<=2*i; k++)
				{
					System.out.print(" ");
				}
				for(int l=1; l<=n-i; l++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
			else
			{
				
				for(int i=1; i<=n; i++)
				{
					for(int j=1; j<=i; j++)
					{
						System.out.print("*");
					}
					
					for(int k=1; k<=col-2*i; k++)
					{
						System.out.print(" ");
					}
					
					for(int l=1; l<=i; l++)
					{
						System.out.print("*");
					}
					System.out.println();
					
				}
					
					for(int i=1; i<=n-1; i++)
					{
						for(int j=1; j<=n-i; j++)
						{
							System.out.print("*");
						}
						
						for(int k=1; k<=2*i+1; k++)
						{
							System.out.print(" ");
						}
						for(int l=1; l<=n-i; l++)
						{
							System.out.print("*");
						}
						System.out.println();
					}
			}
		scan.close();
		}
		
	}

