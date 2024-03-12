package practice2023;

import java.util.PriorityQueue;

public class PriorityQueuePractice {
	
	public static void main(String [] args)
	{
		PriorityQueue a = new PriorityQueue(9);
		a.add('a');
		a.add('b');
		a.add('c');
		a.add('d');
		a.add('e');
		a.add('f');
		a.add('g');
		
		
		System.out.println(a);
		a.add('h');
		a.add('i');
		System.out.println(a.size());
		a.offer('j');
		a.add('k');
		a.poll();
		a.add('m');
	//	System.out.println(a.peek());
		System.out.println(a);
		
		a.remove();
		System.out.println(a);
		a.clear();
	//	System.out.println(a);
		System.out.println(a.poll());
	    System.out.println(a.peek());
		
		
	}

}
