package stringPrograms;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
		
		int [] a = {10,6,0,9,12,5,0,3,2,1,0,7};
		int count=1;
		int temp=0;
		int n = a.length-1;
		for(int i=n; i>=0; i--)
		{
		   
			for(int j=0; j<=n; j++)
			{
				if(a[j]==0)
				{
					temp= a[i];
					a[i]=a[j];
					a[j]=temp;
					i--;
				}
				
				if(j==n);
				break;
			}
			
		  
		  
		}
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
	}
}
