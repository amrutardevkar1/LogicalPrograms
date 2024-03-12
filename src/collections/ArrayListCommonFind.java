package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListCommonFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list1= new ArrayList<>(Arrays.asList(1,2,3,1));	
		ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(1,2,4));	
		ArrayList<Integer> list3 = new ArrayList<>();
		ArrayList<Integer> list4 = new ArrayList<>();
	    // list1.retainAll(list2);
	   //  System.out.println(list1);
	     
 		 for(int i=0; i<list1.size(); i++)
 		 {
 			 for(int j=0; j<list2.size(); j++)
 			 {
 				 if(list1.get(i)==list2.get(j))
 				 {
 					 list3.add(list1.get(i));
 				 }
 			 }
 		 }
 		 
 		 System.out.println(list3);
 		 
 		 for(Integer a: list1)
 		 {
 			 for(Integer b:list2)
 			 {
 				 if(a==b)
 				 {
 					 list4.add(a);
 				 }
 			 }
 		 }
 		 
 		 System.out.println(list4);
	}
	
	
	

}
