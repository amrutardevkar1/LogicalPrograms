package practiceNew;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {
	
	public static void main(String[] args) {
		
		String s = "abcdefgghhijkllmnoo";
		System.out.println("String with duplicates: " + s);
		char [] l = s.toCharArray();
		StringBuilder withoutDuplicates =  new StringBuilder();
		
		Set set = new HashSet();
		
		for(char letter:l)
		{
			if(!set.contains(letter))
			{
				set.add(letter);
				withoutDuplicates.append(letter);
			}
		}
		
		
			System.out.println(set);
		
		
		System.out.println(withoutDuplicates);
	}

}
