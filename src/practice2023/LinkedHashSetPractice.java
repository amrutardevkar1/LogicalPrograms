package practice2023;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice {

	
	public static void main(String [] args)
	{
		LinkedHashSet a = new LinkedHashSet();
		LinkedHashSet <Integer> b = new LinkedHashSet<Integer>();		
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
		
		a.add("Amu");
		a.add("Devkar");
		System.out.println(a);
		
		b.add(100);
		b.add(101);
		b.add(103);
		System.out.println(b);
		
		System.out.println(a.hashCode());
		
		
	}
}
