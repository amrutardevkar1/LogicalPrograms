package stringPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AnagramString {

	public static void main(String[] args) {
		
		String [] s = {"stop", "pots", "spot", "dog", "god", "top", "pot"};
		
			
		String [] s1 = new String[7]; 
	    int n = s.length;
	    Set l1 = new HashSet();
	    Set l2 = new HashSet();
	    Set l3 = new HashSet(); 
	    
		for(int i=0; i<n; i++)
		{
			char [] a = s[i].toCharArray();
			Arrays.sort(a);
			String sp = new String(a);
			s1[i] = sp;
		}
		
		for(int i=0; i<s1.length; i++)
		{
			System.out.print(s1[i] + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<s1.length; i++)
		{
			for(int j=i; j<s1.length; j++)
			{
				if(s1[i].contains("opst"))
				{
					l1.add(s[i]);
				}
				
				else if(s1[i].contains("dgo"))
				{
					l2.add(s[i]);
				}
				
				else if( s1[i].contains("opt"))
				{
					l3.add(s[i]);
				}
			}
		}
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
	}
}
