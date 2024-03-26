package practice;
import java.util.ArrayList;

public class FindSumOfNumbersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	


		
		System.out.println(sumOfDigits("Amruta1221Deevkar#21"));
		System.out.println(secondWay("Amruta1221Deevkar#21"));
      

	}


	public static int sumOfDigits(String s)
	{
		String s1=s.substring(6,10);
		String s2 =s.substring(17);
		String str= s1+s2;
		System.out.println(str);
        Integer n = Integer.valueOf(str);
        int n1= n;
        System.out.println(n);
        int sum=0;
     while(n1>0)
     {
    	
         int r=0;
         r=n1%10;
         sum =sum+r;
         
         n1=n1/10;
         
     }
     
     return sum;
	}
	
	public static int secondWay(String s)
	{
		ArrayList<Integer> li = new ArrayList<>();
		char [] ch =s.toCharArray();
		int sum=0;
	    for(char c:ch)
	    {
	    	if(Character.isDigit(c))
	    	{
	    		sum+=Character.getNumericValue(c);
	    	}
	    }
		
		return sum;
	}
	

}
