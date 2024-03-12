package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap01 {

	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap<>();
		hm.put("101", "amruta");
		hm.put("102","pratima");
		hm.put("103", "supri");
		hm.put("104", "kaji");
		hm.put("105", "ajay");
		
		System.out.println(hm.entrySet());
		System.out.println(hm.get("104"));
		System.out.println(hm.hashCode());
		hm.replace("103", "supriya");
		System.out.println(hm.get("103"));
	    hm.put("107", "pratiksha");
	   System.out.println(hm.keySet()); 
	   System.out.println(hm.isEmpty());
	   System.out.println(hm.get("106"));
	   System.out.println(hm.values());
	   System.out.println(hm.containsValue("amu"));
	   System.out.println(hm.getOrDefault("106", "****"));
	   System.out.println(hm.entrySet());
	   hm.remove("107");
	   hm.putIfAbsent("103", "Devkar");
	   hm.replace("105", "Gau");
	   
	 
	   
		for(Map.Entry ent : hm.entrySet())
		{
			System.out.println(ent.getKey() + "   "+ ent.getValue());
		}
	}
	
	
}
