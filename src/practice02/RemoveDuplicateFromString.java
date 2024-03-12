package practice02;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromString {
	
	public static void main(String[] args) {
		
		String s = " my name is is amruta and and my my surname is devkar";
		String [] words = s.split(" ");
		Set set = new HashSet();
		int count=1;
		for(int i=0; i< words.length; i++)
		{
			
			for(int j=i+1; j<words.length; j++)
			{
				if(words[i].equalsIgnoreCase(words[j]) && (!words[j].equals("0")) && (!set.contains(words[i])))
				{
					count++;
					set.add(words[i]);
					System.out.println("duplicate is "+ words[i]);
					words[j]="0";
				}
			}
			
		
			
		}

	}
}
