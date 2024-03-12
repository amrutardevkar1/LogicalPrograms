package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMethod {

	public static void main(String[] args) {

		List<Integer> num = new ArrayList<> ();
		num.add(500);
		num.add(400);
		num.add(200);
		num.add(700);
		num.add(900);

		System.out.println(Collections.max(num));
		System.out.println(Collections.min(num));

		Collections.sort(num);
		System.out.println(num);
		Collections.swap(num, 2, 4);
		System.out.println(num);
		Collections.replaceAll(num, 500, 400);
		System.out.println(num);
		Collections.rotate(num, 2);
		System.out.println(num);
		Collections.reverseOrder();
		System.out.println(num);
		List<String> name1 =Collections.emptyList();
		System.out.println(name1);
		
		
		
		List<String> name = new ArrayList<> ();
		name.add("amruta");
		name.add("Amruta");
		name.add("supri");
		name.add("Pratima");
		name.add("kajal");
		
		Collections.reverseOrder();
		System.out.println(name);
		Collections.shuffle(name);
		System.out.println(name);
	    Collections.sort(name);
	    System.out.println(name);
	    Collections.addAll(name, "amu");
	    System.out.println(name);
	    Collections.fill(name, "amu");
	    System.out.println(name);
	    Collections.replaceAll(name, "amu", "Amruta");
	    System.out.println(name);
	    

	}

}

