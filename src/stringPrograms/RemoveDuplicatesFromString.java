package stringPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {
	
	public static void main(String[] args) {
		
		
		String withDuplicates= "aabcdefffGGHHtcvvszxeuiklsmnopqadDV";
		System.out.println("String with duplicates: " + withDuplicates);
		
		StringBuilder withoutDuplicates = new StringBuilder();
		
		char [] letters = withDuplicates.toCharArray();
		
		Set set = new HashSet();
		
		for(char letter:letters)
		{
			if(!set.contains(letter))
			{
				set.add(letter);
				withoutDuplicates.append(letter);
			}
			
		}
		
		System.out.println("String after removing duplicates: " + withoutDuplicates);
	}

}
