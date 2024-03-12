package practice2023;

import java.util.LinkedList;

public class LinkedListPractice {
	
	public static void main(String [] args)
	{
		LinkedList a = new LinkedList();
		LinkedList<Character> b = new LinkedList<Character>();
		LinkedList<Integer> c = new LinkedList<Integer>();
		for(char i='a'; i<='z'; i++)
		{
			a.add(i);
			
		}
		
		for(char i= 'j'; i<= 'o'; i++)
		{
			b.add(i);
		}
		
		for(int i=1; i<=20; i++)
		{
			c.add(i);
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//a.addAll(c);
		
		System.out.println(a.contains(11));
		a.addAll(6,c);
		System.out.println(a);
		a.offer(1);
		a.offerFirst(1);
		a.offerLast("Amu");
		
		System.out.println(a);
		System.out.println(a.peekLast());
		a.poll();
		a.pollLast();
		
		System.out.println(c.size());
		
		a.removeAll(c);
		System.out.println(a);
		
	}

}
