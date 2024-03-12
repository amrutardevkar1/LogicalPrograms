package lambdaExpression;


interface MyLambdaTest<T>{
	
	T test(T t);
}

public class LambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyLambdaTest<Integer> facto = (n)-> {
			int factorial=1;
			
			for(int i=1; i<=n; i++)
			{
				factorial = factorial*i;
			}
			return factorial;
		};
		
		System.out.println("Factorial of give number is: " +facto.test(5));

	

	
	MyLambdaTest<String> reverse = (s) -> {
		
		                                     StringBuilder sb= new StringBuilder(s);
		                                     String rev = sb.reverse().toString();
		                                     return rev;
	                                       };
	      System.out.println("Revrese String is : " +  reverse.test("Amruta"));
		                                     
	}

}