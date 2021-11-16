package practiceNew;

public class FindMissingNumber {
	
	public static void main(String[] args) {
		
		int[] a= {1,2,3,5,6,7};
		int temp=a[0];
		int missing=0;
		System.out.print("Original array is: ");
		for(int i=0; i<a.length;i++)
		{
			System.out.print( a[i] + " ");
		}
		
		for(int i =1; i<a.length; i++)
		{
			if(a[i]==temp+1)
			{
				temp=a[i];
			}
			else
			{
				 missing = temp+1;
			}
		}
		System.out.println();
		System.out.println("Missing number is: " + missing);
	}

}
