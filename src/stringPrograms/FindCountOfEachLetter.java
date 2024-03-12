package stringPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindCountOfEachLetter {

	public static void main(String[] args) {
		
		String s = "missisipe";
		Set set = new HashSet();
		char [] a = s.toCharArray();
		int count=1;
		for(int i=0; i<a.length; i++)
		{  
			count=1;
			for(int j=i+1; j<a.length; j++)
			{
				
				if((a[i]==a[j]) && (!set.contains(a[i])))
				{
					count++;
				}
			}
			
			if(!set.contains(a[i]))
			{
			System.out.println(a[i]+""+count);
			
		}
			set.add(a[i]);
	}
}
}