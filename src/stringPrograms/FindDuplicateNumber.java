package stringPrograms;

public class FindDuplicateNumber {

	public static void main(String[] args) {

		int [] n = {1,2,3,4,5,5,6,7,8};
		System.out.print("Original array is: " );
		for(int i=0; i<n.length; i++)
		{
			System.out.print(n[i] + " ");
		}
		System.out.println();
		int temp=n[0];
		for(int j=1; j<n.length;j++)
		{
			if(temp==n[j])
			{

				System.out.println("Duplicate Number is: " + n[j]);
			}
			else {
				temp=n[j];
			}
		}
	}

}
