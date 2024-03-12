package myPractice;

public class ReverseString01 {

	public static void main(String[] args) {
		
		String a = "My name is amruta";
		char [] s = a.toCharArray();
		 for ( int i= s.length-1; i>=0; i--)
		 {
			 System.out.print(s[i]);
		 }
				
			System.out.println();
		 StringBuilder sb = new StringBuilder("My name is amruta");
		 System.out.println(sb.reverse());
				
	}		
				
	}
