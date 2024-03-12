package myPractice;

public class SortingArray {

	public static void main(String[] args) {

		int [] a = {4,5,3,9,1,0,2,8	};          
		int temp=0;

		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j]>=a[i])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
                }
			}

		}
		
		for(int i =0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}