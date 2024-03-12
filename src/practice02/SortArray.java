package practice02;

public class SortArray {
	
	public static void main(String[] args) {
		
		int []  a = {4,10,11,124,8,99,12,5,1,3,3};
		int temp=0;
		for(int i=0; i<a.length; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				
				if(a[j]>= a[i])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] +" ");
		}
	}

}
