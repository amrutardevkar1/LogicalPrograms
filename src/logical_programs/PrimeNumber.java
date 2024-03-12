package logical_programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		PrimeNumber k = new PrimeNumber();
		k.primenumberprogram();
	}

	public void primenumberprogram()
	{
		System.out.println("Enter any number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int counter = 0;
		int result = 0;


		for(int i=1; i<=number;i++)
		{
			result = number%i;
			if(result==0)
			{
				counter++;
				
			}

		}

		if(counter==2)
		{
			System.out.println(number + " is a prime number");

		}

        else
		{
			System.out.println(number + " is not a prime number");
		}

		scan.close();
	}



}


