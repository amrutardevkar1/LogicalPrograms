package practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {
	
	public static void main(String[] args) {
		
		String s = "aabbccddeeffghhiijjkkllmmnnoopp";
		System.out.println("String with duplicates: " + s);
		StringBuilder withoutDuplicates = new StringBuilder();
		
		char [] letters = s.toCharArray();
		Set set = new HashSet();
		
		for(char letter: letters)
		{
			if(!set.contains(letter)) {
				set.add(letter);
				withoutDuplicates.append(letter);
			}
			
		}
		
		System.out.println("String without duplicates: " + withoutDuplicates);
	}

}
