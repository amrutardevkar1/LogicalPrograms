package streamAPI;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.lang.Integer;


import java.lang.Integer;

public class StreamAPICountLimitReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList("cat" , "dog","lion","tiger","fox","elephant","zebra","lion");
		long count = strings.stream().filter(str -> str.equalsIgnoreCase("lion")).count();
		System.out.println(count);
		
		
		
		List<Integer> numbers = Arrays.asList(11,123,45362,8907,0,19,9,375273,3431);
		List<Integer> sortedNums = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNums);
		
		
		List<Integer> reverseOrder = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseOrder);
	   
		List<String> str = Arrays.asList("amruta" , "supriya","pratima","pratiksha","Amruta","Bhargavi","Anshuli","kajal");
		List<String>  sortedStr = str.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedStr);
		
		
		List<String>  sortedStr2 = str.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedStr2);
		
	   System.out.println(str.stream().anyMatch(s -> s.startsWith("a")));
		
	    Optional<String> string2 = str.stream().findAny();
	    System.out.println(string2);
	    Optional<String> string3 = str.stream().findFirst();
	    System.out.println(string3);
	    
	    

}
}