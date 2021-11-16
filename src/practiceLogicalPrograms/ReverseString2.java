package practiceLogicalPrograms;

public class ReverseString2 {

	public static void main(String[] args) {
		
		StringBuilder a = new StringBuilder("I am fine");
		System.out.println(a);
		
		int l = a.length();
		System.out.println("Length of string is: " +l);
		
		
		for(int i =l-1; i>=0; i--)
		{
			System.out.print(a.charAt(i));
		}
	}
}
