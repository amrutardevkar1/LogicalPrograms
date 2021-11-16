package logical_programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		ReverseNumber k = new ReverseNumber();
		k.ReverseNumberPrgm();
	}
	
	public void ReverseNumberPrgm()
	{
		System.out.println("Enter any number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int reverse = 0;
		int remainder = 0;
		int number1 = number;
		
		while(number1>0)
		{
			remainder = number1 % 10;
			reverse = reverse*10 + remainder;
			number1= number1 / 10;
		}
		
		System.out.println("Reverse of given number is " +reverse);
		scan.close();
	}
}
