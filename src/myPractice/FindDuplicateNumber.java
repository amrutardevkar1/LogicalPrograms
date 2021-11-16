
package myPractice;

public class FindDuplicateNumber {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,4,5,6,6,7};
		int temp=a[0];
		System.out.print("Duplicate number= " );
		for(int i=1; i<a.length; i++)
		{
			if(temp==a[i])
			{
				System.out.print( a[i] + " " );
			}
			
			else
			{
				temp=a[i];
			}
		}
		
		
				
	}

}
