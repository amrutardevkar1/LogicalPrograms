package practice2023;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayPractice {
	
	public static void main(String [] args)
	{
	   int a[][] = new int[2][2];
	   a[1][1]=2;
	   
	  int b[][]= {{2,3,4,5},{3,5,5,6},{3,4,2,7}};
	 //  System.out.println(a[1][0]+a[1][1]);
	   /* int l1= b.length;
	    int l2 =b[0].length;
	    System.out.println(l1);
	    System.out.println("start ");
	    for(int i=0; i<l1; i++)
	    {
	    	for(int j=0; j<l2; j++ )
	    		
	    	{
	    		System.out.print(b[i][j] +"   ");
	    	}
	    	
	    	System.out.println();
	    }
	    
	    
	    
	    for(int c[]:b)
	    {
	    	for(int d:c)
	    	{
	    		System.out.print(d+ "  ");
	    	}
	    	
	    	System.out.println();
	    }*/
	    
	    
	    String s="my name is amruta";
	    String s2 =("amruta is name my ");
	   System.out.println( s.contains("am"));
	   System.out.println( s.contains("gau"));
	   System.out.println(s.contentEquals("my name is amruta"));
	   System.out.println(s.compareTo(s2));
	   StringBuilder s3 = new StringBuilder();
	   String [] abc = s.split(" ");
	   int n = abc.length;
	   System.out.println(n);
	  
	   for(int k=n-1; k>=0 ; k--)
	  {
		  // System.out.print(abc[k] + " ");
		   
		   s3.append(abc[k] + " ");
		   
		   
	   }
	   System.out.println(s3);
	   String s4 = s3.toString();
	   System.out.println(s2.equals(s4));
	   //char [] def = new char[100];
	   System.out.println(s2.compareTo(s4));
	  System.out.println(s4.replaceAll("am","ma")); 
	  System.out.println(s.indexOf('a'));
	  System.out.println(s.indexOf('a', 6));
	  System.out.println(s.indexOf("amruta"));
	  System.out.println(s.strip());
	  System.out.println(s.substring(10));
	 // def= s.toCharArray();
	//  System.out.println(def[9]);
	 /* for(int j =((def.length)-1); j>=0; j--)
	  {
		  System.out.print(def[j]);
	  }*/
	 
	  
	  
	  System.out.println();
	  String md="aaabcvgfaaadehhhaaasdjjjjaadjjaaaajjjddd";
	//  System.out.println(s5.replaceAll("aaa", "a"));
	  int count=1;
	  Set x= new HashSet();
		
	  char [] z= md.toCharArray();
	  //x.add(z[0]);
	  
	 
	  for(int m=0; m< z.length;m++)
	  {
		  
		  
		for(int t=m+1; t<z.length; t++)
		{
			
			if((z[m] ==z[t]) && (!x.contains(z[m])))
			{
				count++;
			}
			
		}
		
		
		if(!x.contains(z[m]))
		{
		System.out.println(z[m] +" "+ count);
		}
		x.add(z[m]);
		count=1;
	  }
		
	  }
	  

	}


