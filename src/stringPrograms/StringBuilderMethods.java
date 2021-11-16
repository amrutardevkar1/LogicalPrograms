package stringPrograms;

public class StringBuilderMethods {
	
	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder("Amruta");
		//append
		
		s.append(" Devkar");
		System.out.println("Append Method: " + s);
		System.out.println();
		
		StringBuilder s1 = new StringBuilder("Amruta");
		s1.insert(4, "Devkar");
		System.out.println("Insert method: " + s1);
		System.out.println();
		
		StringBuilder s2 = new StringBuilder("Amruta");
		s2.replace(5,6, "Devkar");
		System.out.println("Replace method: " + s2);
		System.out.println();
		
		StringBuilder s3 = new StringBuilder("Amruta");
		s3.delete(4,5);
		System.out.println("Delete Method: " + s3);
		System.out.println();
		
		StringBuilder s4 = new StringBuilder();
		System.out.println("current capacity: " +s4.capacity());
		s4.append("Amruta");
		System.out.println("Capacity2: " + s4.capacity());
		s4.append("is my name and Devkar is my surname");
		System.out.println("Capacity2: " + s4.capacity());
		System.out.println();
		
		
		
	}
	
	
	
	

}
