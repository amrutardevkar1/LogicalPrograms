package stringPrograms;

public class CoutOfCharsInString {

	public static void main(String[] args) {
		
		String s = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("original string is:" + s);
		char []  letters = s.toCharArray();
		System.out.println("count of letters in string is: " + letters.length);
	}
}
