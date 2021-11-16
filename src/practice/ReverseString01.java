package practice;

public class ReverseString01 {
	
	public static void main(String[] args) {
		
		
		StringBuilder s = new StringBuilder("My name is Khan");
		System.out.println("Orignal string is: " +s);
		StringBuilder reverse = s.reverse();
		System.out.println("Reverse string is: " + reverse);
	}

}
