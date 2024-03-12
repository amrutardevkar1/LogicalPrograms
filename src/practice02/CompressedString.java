package practice02;

import java.util.HashSet;

public class CompressedString {
	
	public static void main(String[] args) {
		
		String s = "aaabbbccccddeefghiijjkllammmna";
		char [] a = s.toCharArray();
		int count=1;
		int n = a.length;
		char temp =a[0];
		for(int i=1; i<n; i++)
		{
			if(a[i] == temp)
			{
				count++;
			}
			
			else
			{
				System.out.print(temp + ""+count);
				count=1;
				temp=a[i];
			}
		}
		System.out.print(temp+""+count);
		countLetters();
		
	}
	
	
	public static void countLetters()
	{
		String s = "aaabbbccccddeefghiijjkllammmna";
		char [] a = s.toCharArray();
		int count=1;
		
		HashSet set = new HashSet();
		for(int i=0; i<a.length; i++)
			{
			  
			  if(!set.contains(a[i]))
			  {
			 for(int j= i+1; j<a.length; j++)
			 {
				 if((a[i] == a[j]))
				 {
					 count++;
				 }
						 
			 }
			 
			 set.add(a[i]);
			 System.out.print("   " +a[i] + " " +count+ "    ");
			 count=1;
			  }	
	}
	
	}}
