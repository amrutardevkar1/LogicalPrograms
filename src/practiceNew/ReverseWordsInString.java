package practiceNew;

public class ReverseWordsInString {
	
	public static void main(String[] args) {
		
		String s = "My name is Amruta and I live In India";
		System.out.println("Original string is: " + s);
		StringBuilder reverse =  new StringBuilder();
		String [] words =  s.split(" ");
		
		for(String word:words)
		{
			StringBuilder reverseWord =  new StringBuilder(word).reverse();
			reverse.append(reverseWord + " ");
		}
		
		System.out.println("Rverse string is: " + reverse);
	}

}
