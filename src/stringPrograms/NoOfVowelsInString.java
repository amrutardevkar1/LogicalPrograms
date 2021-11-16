package stringPrograms;

public class NoOfVowelsInString {
	
	public static void main(String[] args) {
		
		String s = "My name is amruta and i live in india";
		
		char [] letters = s.toCharArray();
		int count = 0;
		
		for(char c : letters)
		{
			switch(c)
			{
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
		System.out.println("Count of vowels: " + count);
	}

}
