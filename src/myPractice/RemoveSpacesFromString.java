package myPractice;

public class RemoveSpacesFromString {
	
	public static void main(String[] args) {
		
		String s = "My name is amruta";
		System.out.println("Original string is: " +s);
		String removespaces = s.replaceAll("\\s", "");
		System.out.println("String after removing spaces: " +removespaces);
	}

}
