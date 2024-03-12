package practice2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String [] args)
	{
		ArrayList a = new ArrayList();
		ArrayList b = new ArrayList();
		for(char i ='A'; i<='Z'; i++)
		{
			a.add(i);
		}
		
		for(char i ='M'; i<='T'; i++)
		{
			b.add(i);
		}
		ArrayList d = (ArrayList) b.clone();
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.size());
		System.out.println(b.contains('A'));
		System.out.println(a.get(20));
		b.add(0,'A');
		System.out.println(b.contains('A'));
		System.out.println(a.containsAll(b));
		a.addAll(b);
		Collections.reverse(a);
		System.out.println(a);
		Collections.sort(a,Collections.reverseOrder());
		
		System.out.println(a);
		System.out.println(b.retainAll(a));
		
		System.out.println(b);
		//a.removeAll(b);
		Object[] c = a.toArray();
		
		
		//System.out.println(a);
		
		Iterator it = a.iterator();
		System.out.println(it.next());
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
			
		}
		System.out.println();
		b.clone();
		System.out.println(b);
		System.out.println(d);
		System.out.println(a.equals(b));
		b.remove("A");
		System.out.println(b);
		b.clear();
		System.out.println(b);
		
		
		
						
	} 
		

	
		
			
}
