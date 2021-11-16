package practiceNew;

public class RemoveSpacesInString {
	
	public static void main(String[] args) {
		
		String s = "My name is Amruta";
		System.out.println("Original string is: " +s );
		String ws = s.replaceAll("\\s", "");
		System.out.println("String after removing spaces: " + ws);
	}

}
