package practiceNew;

public class NumbersOfVowelsInString {
	
	public static void main(String[] args) {
		
		String s = "my name is amruta and i live in india";
		System.out.println("Original string is: " +s);
		char[] a = s.toCharArray();
		int count=0;
		for(char c:a)
		{
			switch(c) {
			case'a':
			case'e':
			case'i':
			case'o':
			case'u':
			count++;
			break;
				default:
		}
		}
		System.out.println("No od vowels in given string are: " +count);
		

	}

}
