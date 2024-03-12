package myPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListOfHashmap {

	public static void main(String [] args)
	{
		List<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("username", "amu");
		map.put("password", "amuAD");
		map.put("gender", "female");
		
		list.add(map);
		System.out.println(list);
		System.out.println(map);
		HashMap<String,String> map2 = new HashMap<String,String>();
		map2.put("username", "gau");
		map2.put("password", "gauGJ");
		map2.put("gender", "male");
		
		System.out.println(list);
		list.add(map2);
		System.out.println(map2);
		System.out.println(list);
		System.out.println(list.get(0).get("password"));
		
	}
}
