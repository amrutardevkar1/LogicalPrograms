package streamAPI;

import java.util.Arrays;
import java.util.List;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Integer [] arr = {1,2,3};
		
		List<Integer> list = Arrays.asList(arr);
		list.stream().((n) -> {
			                 Integer factor=1;
			                  for(inti=1; i<=n; i++)
						  {
						     factor= factor*i;
						  }
			                  return factor;
	                        	} ).forEach(System.out::println);
	
	}

}
