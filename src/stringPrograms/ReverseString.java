package stringPrograms;

public class ReverseString {

	public static void main(String[] args) {

		StringBuilder s = new StringBuilder("My name is Amruta");
		System.out.println("Original string: " + s);

		System.out.println("Reverse of give string: " + s.reverse());
		type2();
	}

	public static void type2()
	{
		String s ="My name is amruta";
		//StringBuilder s1 = new StringBuilder();
		System.out.println("Original string: " + s);
		char [] a= s.toCharArray();

		for(int i=(a.length-1); i>=0; i--)
		{
			System.out.print(a[i]);
		}
	
			

				
	}

}
