package stringPrograms;

public class ReverseString {
	
	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder("My name is Amruta");
		System.out.println("Original string: " + s);
		
		System.out.println("Reverse of give string: " + s.reverse());
	}

}
