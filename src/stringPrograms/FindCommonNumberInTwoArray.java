package stringPrograms;

public class FindCommonNumberInTwoArray {
	
	public static void main(String[] args) {
		
		int []  a = {1,2,3,4,5};
		int []  b = {6,7,8,4,4};
		
		
		System.out.print("First array is: ");
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		System.out.print("Second array is: ");
	
		for(int j = 0; j<b.length; j++)
		{
			
			System.out.print(b[j]+ " ");
		}
		
		for(int i=0; i<a.length;i++)
		{
		
			for(int j=0; j<b.length; j++)
			{
			
				if(a[i]==b[j])
				{
					System.out.println();
					System.out.println("Common number in both array is: " + a[i]);
				}
			}
		}
		
	}

}
