package practice02;

public class AppendAllZerosToLast {
	
	public static void main(String[] args) {
		
		int [] a = {0,1,4,7,0,5,6,0,9,10,0,11};
		int temp=0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]= temp;
				}
			}
			
		}
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		test1();
		
	}

	public static void test1() {
		
		int [] a = {0,1,4,7,0,5,6,0,9,10,0,11};
		int temp=a[0];
		int temp1=0;
		
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>temp && a[i]==0)
			{
				temp1=a[i];
				a[i]=temp;
				temp=temp1;

			}
			
			else
			{
				temp=a[i];
			}
				
				
		}
		
		
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
}
