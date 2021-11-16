package practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter any number");
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		int remainder=0;
		int armstrong =0 ;
		int count=0;
		int n = number;
	    int number2= number;
	   
		while(n>0)
		{
		 n= n/10;
		 count++;
		 
		}
		System.out.println(count );
		
		while(number2>0)
		{   
			 int r=1;
			remainder =  number2 % 10;
			for(int i =1; i<=count; i++)
			{
				r= r*remainder;  //1*3  3*3  3*3
			}
			
			armstrong= armstrong+r;
			number2= number2/10;
		}
		
		if(number== armstrong)
		{
			System.out.println("Number is armstrong number");
		}
		
		else
		{
			System.out.println("Number is not armstrong number");
		}
		
		scan.close();
	}
	
}
