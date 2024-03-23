package practice;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		plindromeFirst("I mom I");
	}

	public static void plindromeFirst(String s1)
	{
		StringBuilder s = new StringBuilder(s1);
		System.out.println("Given string is: " + s);
		StringBuilder reverse = s.reverse();
		
		System.out.println("Reverse of given string is: " +reverse);
		if(s.equals(reverse))
		{
			System.out.println("Given string is palindrom string");
		}
		
		else
		{
			System.out.println("Given string is not palindrome");
		}
	}
}
