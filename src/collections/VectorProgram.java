package collections;
import java.util.*;

public class VectorProgram {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub 
		
		Vector<Integer> vect = new Vector<>();
		vect.add(2);
		vect.add(1);
		vect.add(3);
		vect.add(8);
		vect.add(5);
		vect.add(1);
		vect.add(9);
	    System.out.println(vect);
	    
	  System.out.println(   vect.elementAt(4));  
	  vect.addElement(12);
	  System.out.println( vect.firstElement());
	
	}

}
