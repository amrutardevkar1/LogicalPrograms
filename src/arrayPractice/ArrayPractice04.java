package arrayPractice;

import java.util.Arrays;

public class ArrayPractice04 {

	
	public static void main(String[] args) {
		
		char [] alphabets = {'A', 'I', 'Z', 'P', 'M'};
		
		Arrays.sort(alphabets);
		int length = alphabets.length;
		
		System.out.println("Alphabets in ascending order: ");
		for(int i=0; i<length; i++)
		{
		System.out.println(alphabets[i]);
		}
		
		System.out.println("Alphabets in descending order: ");
		for(int i=length-1; i>=0; i--)
		{
		System.out.println(alphabets[i]);
		}
		
		
		
	}
}
