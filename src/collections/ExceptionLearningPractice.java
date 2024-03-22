package collections;
import java.util.*;

public class ExceptionLearningPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		 List<Integer> list = new ArrayList<>();
		 list.add(1);
		 list.add(2);
		 list.add(3);
		 
		 List<Integer> list2 = new ArrayList<>();
		 list2.add(1);
		 list2.add(4);
		 list2.add(5);
		 System.out.println(list);
		 System.out.println(list2);
		 
		 Set<String> set = new HashSet<>();
		 set.add("abc");
		 set.add("zsc");
		 set.add("jkl");
		 
		 Set<Integer> set2 = new HashSet<>();
		 set2.add(1);
		 set2.add(2);
		 set2.add(3);
		 
		 List list3 = new ArrayList<>();
		 
		 list.retainAll(list2);
		 System.out.println(list);
		 System.out.println(set.equals(set2));
		 list3.get(2);
		
		
	}

}
