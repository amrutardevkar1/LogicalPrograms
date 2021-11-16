package practice;

public class ReverseWordsInString {
	
	public static void main(String[] args) {
		
		String s = " My name is Amruta and I live in India";
		
		StringBuilder reverseString = new StringBuilder();
		
		String[] words = s.split(" ");
		
		
		for(String word: words)
		{
			StringBuilder reverseWord = new StringBuilder(word).reverse();
			reverseString.append(reverseWord + " ");
		}
		
		System.out.println(reverseString);
		
	}

}
