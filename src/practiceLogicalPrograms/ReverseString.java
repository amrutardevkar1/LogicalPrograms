package practiceLogicalPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		StringBuilder a = new StringBuilder("I ama I");
		StringBuilder string1 = a;
		System.out.println("Original string is: " +a);
		
		StringBuilder reverse = a.reverse();
		System.out.println("Reverse string is: " + a.reverse());
		
		if(string1.equals(reverse))
		{
			System.out.println("String is palindrome string");
		}
	}
}
