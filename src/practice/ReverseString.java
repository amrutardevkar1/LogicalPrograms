package practice;

public class ReverseString {
	
	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder("My name is Amruta");
		
		StringBuilder reverse= s.reverse();
		System.out.println("Reverse of given string is: " + reverse );
		
	}

}
