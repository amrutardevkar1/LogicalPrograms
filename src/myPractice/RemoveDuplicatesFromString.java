package myPractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {
	
	public static void main(String[] args) {
		
		String s = "abccddeghijjklllmnop";
		char [] letter = s.toCharArray();
		Set set = new HashSet();
		
		for(char l: letter)
		{
			if(!set.contains(l))
			{
				set.add(l);
				System.out.print(l+" ");
			}
		}
	}

}
