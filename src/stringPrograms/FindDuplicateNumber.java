package stringPrograms;

public class FindDuplicateNumber {

	public static void main(String[] args) {

		int [] n = {1,2,3,4,5,5,6,7,8,4,2};
		
	//	int temp=n[0];
		for(int i=0; i<n.length;i++)
		{
			for(int j=i+1; j<n.length; j++)
			{
			if(n[i]==n[j])
			{

				System.out.println("Duplicate Number is: " + n[i]);
			}
			
		}
			
		}
	}

}
