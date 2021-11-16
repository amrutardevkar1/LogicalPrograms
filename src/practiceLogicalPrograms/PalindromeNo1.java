package practiceLogicalPrograms;

public class PalindromeNo1 {

	public static void main(String[] args) {

		int remainder=0;
		int reverse=0;
		int number;

		System.out.println("List of palindrome numbers:");
		for(int i=1; i<=200; i++)
		{
			number=i;
			reverse=0;
			while(number>0)
			{
				remainder = number%10;
				reverse = reverse*10 + remainder;
				number=number/10;
			}

			if(reverse==i)
			{
				System.out.print(i + " ");
			}


		}
	}

}
