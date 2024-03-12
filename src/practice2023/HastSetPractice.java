package practice2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HastSetPractice {
	
	
	public static void main(String [] args)
	{
		
		HashSet a = new HashSet();
		HashSet<Integer> b = new HashSet<Integer>();
		HashSet h = new HashSet();
		
		h.add("Amruta");
		h.add("AMRUTA");
		h.add("amruta");
		List list = new ArrayList();
		
		int count =0;
		
		Iterator<HashSet> it =h.iterator();
		while(it.hasNext())
		{
			it.next();
			if(h.contains("amruta"));
			{
				
			}
		}
		
		for(char i = 'A'; i<='Z'; i++)
		{
			a.add(i);
		}
		
		for(int i=1; i<=15; i++)
		{
			b.add(i);
		}
		
		System.out.println(a);
		System.out.println(b);
		
		a.add('W');
		
		System.out.println(a);
		a.addAll(b);
		System.out.println(a);
		a.removeAll(b);
		System.out.println(a);
		
		
		a.add(5);
		a.add(10);
		a.add('a');
		a.add('b');
		b.add(null);
		b.add(null);
		b.add(100);
		System.out.println(b);
		System.out.println(a);
	    b.remove(null);
	    System.out.println(b);
	    b.remove(100);
	    System.out.println(b);
		
		removeDuplicate();
	}
	
	public static void removeDuplicate()
	{
		String s = "aabbcedsfhjcsskl";
		String s2 = "aabbcedsfhjcsskl";
		System.out.println(s.compareTo(s2));		
        StringBuilder s1 = new StringBuilder();
        char[] a = s.toCharArray();
        int n= a.length;
       
        HashSet<Character> st = new HashSet<Character>();
        for(int i=0; i<n; i++)
        {
            if(!st.contains(a[i]))
            {
                s1.append(a[i]);
                st.add(a[i]);
                
            }
        }
        System.out.println(s1);
	}

}
