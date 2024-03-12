package myPractice;

public class FirstandSeconfGreaterNumber {
	
	public static void main(String[] args) {
		
		int a [] = {7,0,1,2,3,4,5,8,9};
		
		int first=0;
		int second=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>first)
			{
				second=first;       //0  7  8 
				first=a[i];         //7  8   9
				
			}
		}
		
		System.out.println(first+ " and " + second);
	}

}
