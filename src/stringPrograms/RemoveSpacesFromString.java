package stringPrograms;

public class RemoveSpacesFromString {
	
	public static void main(String[] args) {
		
		String s = "My name is Amruta";
		System.out.println("Original string is: " + s);
		String withoutSpaces = s.replaceAll(" " ,"");
		System.out.println("String after removing spaces: " + withoutSpaces);
		type2();
	}
	
	public static void type2()
	{
		String s = "My name is Amruta";
		System.out.println("Original string is: " + s);
		StringBuilder newaString = new StringBuilder();
		char [] l = s.toCharArray();
		for(char a:l)
		{
			if(a != ' ')
			{
				newaString.append(a);
			}
		}
		
		System.out.println("String after removing spaces: " + newaString);
	
	}

}
