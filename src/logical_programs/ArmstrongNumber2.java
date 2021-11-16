package logical_programs;

import java.util.Scanner;

public class ArmstrongNumber2 {
	
	public static void main(String[] args) {
		
		ArmstrongNumber2 k = new ArmstrongNumber2();
		k.ArmstrongNumberUserInput();
		
	}
	
	public void ArmstrongNumberUserInput()
	{
		System.out.println("Enter any number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int number1 = number;
		int number2= number;
		int count=0;
		int remainder=0;
		int armstrong = 0;
		int multi=1;
		while(number1>0)
		{   
			number1 = number1/10;      
	        count++;             
	              
		}
		
		while(number2>0)
		{
	        multi=1;
			remainder = number2%10;   
			for(int i=1; i<=count; i++)
			{
			 multi= multi*remainder;       
			}
			
			armstrong = armstrong+multi;       
			number2=number2/10;                  
		}
		
		if(armstrong==number)
		{
			System.out.println(number+" is a armstrong number");
		}
		else
		{
			System.out.println(number+ " is not an armstrong number");
		}
		scan.close();
		}
	}


