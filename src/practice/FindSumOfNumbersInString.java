package practice;

public class FindSumOfNumbersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
    
        System.out.println(sumOfDigits("Amruta1221Devkar#gau21"));
	}

	public static int sumOfDigits(String s)
	{
		String s1=s.substring(6,9);
		String s2 =s.substring(20);
		String str= s1+s2;
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
}
