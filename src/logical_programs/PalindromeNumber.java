package logical_programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		PalindromeNumber k = new PalindromeNumber();
		k.PalindromeNumberPrgm();
	}
	
	public void PalindromeNumberPrgm()
	{
		System.out.println("Enter any number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int number1 = number;
		int reverse = 0;
		int remainder = 0;
		while(number1>0)
		{
			remainder = number1%10;
			reverse = reverse*10 + remainder;
			number1 = number1/10;
		}
		if(reverse==number)
		{
			System.out.println(number + " is a plaindrome number");
		}
		
		else
		{
			System.out.println(number+ " is not a palindrome number");
		}
		scan.close();
	}
}
