package myPractice;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

public class CountRepitativeLetters {

	public static void main(String[] args) {
		
		String s = "maharashtra";
		char[] c=s.toCharArray();
	//	char cs = c[0];
		Set set = new HashSet();
		
		int count=1;
		for(int j=0; j<c.length; j++)
		{
			
			for(int i =j+1; i<c.length; i++)
			{
				
				if((c[j]==c[i]) && (!set.contains(c[j])))
				{
					count++;
					
				}
				
				
			}
			
			if(!set.contains(c[j])) {
				System.out.println(c[j]+" "+ count);
			}
			count=1;
			set.add(c[j]);
			//System.out.println(set);
		}
		
	}
}
