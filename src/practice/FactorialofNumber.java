package practice;

import java.util.Scanner;

public class FactorialofNumber {

	public static void main(String[] args) {
		
		System.out.println("Eneter any number to find factorial");
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int factorial=1;
		for(int i = number; i>=1; i--)
		{
			factorial = factorial*i;
		}
		
		System.out.println("Factorial of given number is:" + factorial);
		
		scan.close();
	}
	
	
}
