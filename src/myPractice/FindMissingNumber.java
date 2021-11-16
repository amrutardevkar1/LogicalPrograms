package myPractice;

public class FindMissingNumber {
	
	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,7,8};
		int temp=a[0];
		for(int i=1; i<a.length;i++)
		{
			if(a[i]==temp+1)
			{
				temp=a[i];
			}
			
			else
			{
				System.out.print("missing number is: " + (temp+1));
			    break;
			}
			
		}
	}

}
