package collections;
import java.util.*;

public class ArraysMethods {
	
	public static void main(String [] args)
	{
		int [] a= {1,2,3,4,5,6,7,8,9};
		int [] b = Arrays.copyOf(a,12);
		int [] e = {1,3,5,73,4,3,5,9,0,5,435,674,4,5,67,3};
		
		for(int c: b)
		{
			System.out.print(c +"\s");
		}
		
		System.out.println();
		int [] c = Arrays.copyOfRange(a,3,11);
		for(int d:c)
			{
				System.out.print(d +"\s");
			}
				
		System.out.println(Arrays.binarySearch(a,4));		
		
		Arrays.sort(e);
		
		
		
	}

}
