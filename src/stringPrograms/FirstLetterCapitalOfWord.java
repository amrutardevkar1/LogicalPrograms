package stringPrograms;

public class FirstLetterCapitalOfWord {

	public static void main(String[] args) {
		
		String s = "My name is Amruta";
		
		System.out.println("Original string is: " + s);
		String[] words =  s.split("");
		
		System.out.println("String with 1st letter capital: " );
		for(int i =0; i<words.length; i++)
		{
			char [] letters = words[i].toCharArray();
			
			for(int j=0; j<letters.length; j++)
			{
				letters[0] = Character.toUpperCase(letters[0]);
				System.out.print(letters[j]);
			}
			
			System.out.print(" ");
			
		}
	}
}
