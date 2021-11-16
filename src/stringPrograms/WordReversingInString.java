package stringPrograms;

public class WordReversingInString {

	
	public static void main(String[] args) {
		
		String s = "My name is Amruta";
		System.out.println("Original string: " + s);
		
		StringBuilder reverse = new StringBuilder();
		
		String [] words = s.split(" ");
		
		for(String word: words)
		{
			StringBuilder reverseWord = new StringBuilder(word).reverse();
			reverse.append(reverseWord + " ");
		}
		
		System.out.println("String with reverse words: " + reverse);
	}
}
