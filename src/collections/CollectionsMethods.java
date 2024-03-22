package collections;
import java.util.*;

public class CollectionsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li = new  ArrayList<>(Arrays.asList(12,3,6,21,3,1,5,100,390,372,84920));
		Collections.sort(li);
		System.out.println(li);
		int index = Collections.binarySearch(li,12);
		System.out.println(index);
		ArrayList<Integer> li2 = new ArrayList<>();
		for(int i=0; i<11;i++)
		{
			li2.add(null);
		}
		Collections.copy(li2,li);
		System.out.println(li2);
		li2.add(99);
		System.out.println(li2);
		System.out.println(Collections.disjoint(li, li2));
		List<String> li3= Collections.emptyList();
		
		Collections.fill(li3, "Amu");
		System.out.println(li3);
		System.out.println(Collections.disjoint(li, li3));

		System.out.println(Collections.frequency(li3, "Amu"));
		System.out.println(Collections.frequency(li,3));
		List<Integer> sub = new ArrayList<>(Arrays.asList(3,3,5,6));
		System.out.println(Collections.indexOfSubList(li, sub));
		
		Comparator<Integer> rev = Collections.reverseOrder();
		Collections.sort(li2,rev);
		System.out.println(li2);
		System.out.println(Collections.max(li2));
		System.out.println(Collections.min(li2));

	}

}
