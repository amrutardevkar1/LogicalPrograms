package practice;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder("I mom I");
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
