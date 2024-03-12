package practice02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AddDuplicateStringInOneList {
	
	public static void main(String[] args) {
		
		String [] s = {"Persistent", "persistent", "PERSISTENT", "", "  ", "GOd", "god", "amu"};
		String [] sp = new String[8];
		 int n = s.length;
		 List s1 = new ArrayList();
		 List s2 = new ArrayList();
		 List s3 = new ArrayList();
		 List s4 = new ArrayList();
		 List s5 = new ArrayList();
		 for(int i =0 ; i<n; i++)
		 {
			 String a = s[i].toLowerCase().trim();
			 sp[i]= a;
	     }
		 
       for(int i=0 ; i<n; i ++)
       {
    	   if(sp[i].equals("persistent")) {
    	   s1.add(s[i]);
    	   }
    	   else  if(sp[i].equals(""))
    		   {
    		   s2.add(s[i]);
    		   }
    	   else if(sp[i].equals("god"))
    		   {
    		   s3.add(s[i]);
    		   }
    	   else if(sp[i].equals("amu"))
    		   {
    			   s4.add(s[i]);
    		   }
    	   
    		   
       }
		 
		 System.out.println(s1);
		 System.out.println(s2);
		 System.out.println(s3);
		 System.out.println(s4);
		 
	}

}
