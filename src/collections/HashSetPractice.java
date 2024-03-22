package collections;
import java.util.*;

public class HashSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> set = new HashSet<Integer>(5);
        for(int i=0; i<10; i++)
        {
        	set.add(i);
        }
        
        System.out.println(set);
        
        for(int i=0; i<10; i++)
        {
        	set.add(i+10);
        }
        set.add(24);
        set.add(40);
        System.out.println(set);
        
        
        
        LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>(5);
        for(int i=0; i<20; i++)
        {
        	set2.add(i);
        }
        
        System.out.println(set2);
       
       
       
       
        
	}

}
