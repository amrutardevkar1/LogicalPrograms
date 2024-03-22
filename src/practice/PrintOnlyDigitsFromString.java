package practice;

import java.util.ArrayList;

public class PrintOnlyDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(listOfDigits("amruta1693gau54198lo"));
	}
     
	public static ArrayList listOfDigits(String s)
	{
		ArrayList li = new ArrayList();
		char [] ch= s.toCharArray();
		for(char c:ch)
		{
			if(Character.isDigit(c))
			{
				li.add(c);
			}
		}
		return li;
	}
	
}
