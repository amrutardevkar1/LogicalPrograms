package practice;

public class PalindromeNumber1to200 {
	
	public static void main(String[] args) {
		
		System.out.print("List of palindrome numbers between 1 to 200: ");
		for(int i =1; i<=200; i++)
		{
			int number =i;
			int remainder=0;
			int reverse =0;
			while(number>0)
			{
			 remainder = number%10;
			 reverse= reverse*10 + remainder;
			 number = number/10;
			}
			
			if(reverse==i)
			{
				System.out.print(i +" ");
			}
		}
		
	}

}
