package stringPrograms;

public class ReverseStringWords02 {
	
	public static void main(String[] args) {
		
		String s = "My name is Amruta";
		String [] words = s.split(" ");
		for(int i=words.length-1; i>=0; i--)
		{
			System.out.print(words[i] + " ");
		}
	}

}
