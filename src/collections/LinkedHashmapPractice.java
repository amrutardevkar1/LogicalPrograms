package collections;
import java.util.*;

public class LinkedHashmapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		LinkedHashMap map = new LinkedHashMap(5,1, true);
		map.put(1, "abc");
		map.put(5, "des");
		map.put(2, "dsec");
		map.put(6, "hgf");
		
		
		LinkedHashMap map2 = new LinkedHashMap(5,1, false);
		map2.put(1, "abc");
		map2.put(5, "des");
		map2.put(2, "dsec");
		map2.put(6, "hgf");
		
		System.out.println(map);
		System.out.println(map2);
		
		
		
	}

}
