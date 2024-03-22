package collections;
import java.util.*;

public class LinkedListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,23,4,5,21,3,12,12));
	   System.out.println(list.peekFirst());
	   System.out.println(list);
	   System.out.println(list.pollFirst());
	   System.out.println(list);
	   System.out.println(list.peekLast());
	   System.out.println(list);
	   System.out.println(list.pollLast());
	   System.out.println(list);
	   System.out.println(list.peek());
	   System.out.println(list);
	   System.out.println(list.removeFirst());
	   System.out.println(list);
	   list.addFirst(123);
	   list.addLast(23);
	   list.add(2,6);
	   list.set(3, null);
	   System.out.println(list);
	   
        
	}

}
