package streamAPI;
import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIFilterAndMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {1,2,3,5,6,7,8,9,10,11,12,13,14,15};
		List<Integer> list = Arrays.asList(a);
		
		//display odd numbers
		list.stream().filter((n) -> n%2 == 1).forEach(System.out::println);
		
		//display even numbers
		List<Integer> evenNumbers = list.stream().filter((n)-> n%2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		String[] s = {"cat", "dog", "lion" ,"elephant", "tiger","zebra","buffalo","fox"," ", " "};
		List<String> listA = Arrays.asList(s);
		
		//find the strings have lenth between 1 to 5 
		
		List<String> filteredList = listA.stream().filter((l) -> (l.length()<=5)&& (l.length()>=2)).collect(Collectors.toList());
		System.out.println(filteredList);
		
		List<String> filteredList2 = listA.stream().filter(l -> l.isBlank()).collect(Collectors.toList());
		System.out.println(filteredList2.size());
		
		
		//convertt string to char array
		String s1 ="asbyueckkcnbxakxoqceucgcnkcj";
		char[] c1= s1.toCharArray();
		
		//create new character array
		Character [] c = new Character[c1.length];
		
		//convert char array to character array
		for(int i=0; i<c1.length; i++)
		{
			//c[i] = Character.valueOf(c1[i]);
			c[i]= c1[i];
		}
		
		List<Character> charList = Arrays.asList(c);
		
		Set<Character> set = charList.stream().distinct().collect(Collectors.toSet());
		System.out.println(set.toString());
	
		//find factorial of all numbers
		
		Integer[] n= {1,2,3,4,5,6};
		List<Integer> facto = Arrays.asList(n);
		
	    facto.stream().map((m) -> m*10).limit(4).forEach(System.out::println);
		
		


	}

}
