package practice;

public class WordReverseInString {
	
	public static void main(String[] args) {
		
		
		String s = "My name is Amruta";
		StringBuilder reverseString =  new StringBuilder();
		String [] words = s.split(" ");
		for(String word: words)
		{
			StringBuilder reverseWord = new StringBuilder(word).reverse();
			reverseString.append(reverseWord + " ");
		}
		
		System.out.println(reverseString);
	}
	
	

}
