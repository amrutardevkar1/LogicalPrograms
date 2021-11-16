package stringPrograms;

public class RemoveSpacesFromString {
	
	public static void main(String[] args) {
		
		String s = "My name is Amruta";
		System.out.println("Original string is: " + s);
		String withoutSpaces = s.replaceAll("\\s" ,"");
		System.out.println("String after removing spaces: " + withoutSpaces);
	}

}
