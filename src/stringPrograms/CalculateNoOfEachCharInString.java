package stringPrograms;

import java.util.HashSet;
import java.util.Set;

import javax.swing.plaf.SliderUI;

public class CalculateNoOfEachCharInString {
	
	
	public static void main(String[] args) {
		
		String s= "abacdefggha";
		char [] l = s.toCharArray();
		int count=0;
		char c= l[0];
		
		Set set = new HashSet();
		for(int j=0; j<l.length;j++)
		{
			
		c=l[j];
		for(int i=j; i<l.length; i++)
		{
			if((c==l[i]))
			{
				set.add(l[j]);
				count++;           //1 2
			}
		}
		System.out.println("conut of" + l[j]+" = "+ count);
	}

}
}