package myPractice;

public class RvereseWordsInString {
	
	public static void main(String[] args) {
		
		String s = "My name is amruta";
		System.out.println("Original string is: " + s);
		StringBuilder reverse = new StringBuilder();
		
		String[] words = s.split(" ");
		for(String word: words)
		{
			StringBuilder reverseWord = new StringBuilder(word).reverse();
			reverse = reverse.append(reverseWord + " ");
		}
		
		System.out.println("reverse word string is: " + reverse);
	}

}
