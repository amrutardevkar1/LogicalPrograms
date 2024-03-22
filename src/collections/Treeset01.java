package collections;

import java.util.TreeSet;

public class Treeset01 {
	
	public static void main(String[] args) {
		
		TreeSet <Integer> set = new TreeSet<Integer> ();
		set.add(10);
		set.add(4);
		set.add(1);
		set.add(16);
		set.add(3);
		set.add(5);
		
		System.out.println(set);
		System.out.println(set.floor(6));
		System.out.println(set.higher(16));
		System.out.println(set.headSet(10));
		System.out.println(set.tailSet(3));
		System.out.println(set.subSet(3,10));
		System.out.println(set.descendingSet());
	
		
		
		TreeSet<String> set2 = new TreeSet<>();
		
		set2.add("amruta");
		set2.add("AMRUTA");
		set2.add("Amrita");
		set2.add("AMRITA");
		set2.add("GAU");
		set2.add("Amu");
		set2.add("Pratima");
		set2.add("AMU");
		set2.add("Gau");
		set2.add("gau");
		set2.add("kajal");
		System.out.println(set2);
		System.out.println(set2.first());
		
		System.out.println(set2.last());
		
		System.out.println(set2.floor("BADHAV"));
		System.out.println(set2.ceiling("BADHAV"));
		System.out.println(set2.higher("BADHAV"));
		System.out.println(set2.lower("BADHAV"));
		System.out.println(set2.headSet("Amu"));
		System.out.println(set2.tailSet("amruta"));
		System.out.println(set2.subSet("GAU", "amruta"));
		System.out.println(set2.descendingSet());
	}

}