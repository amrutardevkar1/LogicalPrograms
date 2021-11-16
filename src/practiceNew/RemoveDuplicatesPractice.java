package practiceNew;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesPractice {
	
	public static void main(String[] args) {
		
		String s = "abcddefgghhijkklmnnn";
		System.out.println("String with duplicates: " +s);
		StringBuilder withoutDuplicates = new StringBuilder();
		char[] letters = s.toCharArray();
		
		Set set = new HashSet();
		
		for(char l: letters)
		{
			if(!set.contains(l))
			{
				set.add(l);
				withoutDuplicates.append(l);
			}
		}
		
		System.out.println("String without duplicates: " + withoutDuplicates);
	}
	

}
