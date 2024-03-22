package collections;
import java.util.*;
import java.util.Map.Entry;

public class HashMapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<>();
		
		HashMap<Integer, String> map2 = new HashMap<>();
		map.put(5, "abc");
		map.put(6, "def");
		map.put(3,"ghi");
		map.put(2,  "jkl");
		map.put(1, "mno");
		
		for(Entry set: map.entrySet())
		{
			
			System.out.print(set.getKey() + "   " + set.getValue() + "\n");
		}
		
		System.out.println(map.keySet()  );
		System.out.println(map.entrySet());
		System.out.println(map.values());
		
	    System.out.println(Collections.checkedMap(map, Integer.class, String.class));	
	    
	    System.out.println(map2.get(4));
	}
}

