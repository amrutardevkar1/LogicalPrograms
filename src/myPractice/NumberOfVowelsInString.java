package myPractice;

public class NumberOfVowelsInString {
	
	public static void main(String[] args) {
		
		String s = "amruta is my name and i live in india";
		char [] l = s.toCharArray();
		int count=0;
		for(char letter:l)
		{
			switch(letter){
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
	System.out.println("number of vowels= " + count);	
	}

}
