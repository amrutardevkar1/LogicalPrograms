package practice;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter any number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		int number2 =  number;
		int remainder=0;
		int reverse=0;
		
		while(number2>0)
		{
			remainder = number2%10;
			reverse = reverse*10 + remainder;
			number2 = number2/10;
		}
		
		if(reverse==number)
		{
			System.out.println("given number is palindrome");
		}
		
		else
		{
			System.out.println("given number is not palindrome");
			
		}
		
		scan.close();
	}

}
