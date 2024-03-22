package practiceLogicalPrograms;

import java.util.Arrays;
import java.util.*;

public class FindDuplicatesInList {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		List<String> list1 = Arrays.asList(new String [] {"amu","devkar","Amruta","GAU","amu","gau"});
		List<String> list2 = Arrays.asList(new String[] {"AMU","kajal","gau","pratima"});
		List<String> list3 = new ArrayList<>();
		
		for(int i=0; i<list1.size(); i++)
		{
			for(int j=0; j<list2.size(); j++)
			{
				if(list1.get(i).equalsIgnoreCase(list2.get(j)))
				{
					list3.add(list1.get(i));
				}
			}
		}
		
		System.out.println(list3);
	    list1.retainAll(list2);
		System.out.println(list1);
	}

}
