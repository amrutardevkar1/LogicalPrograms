package myPractice;

public class SortArray {
	
	public static void main(String[] args) {
		
		int[] a= {3,6,2,4,5,1};
		//int temp=a[0];
		int temp1=0;
		for(int i=0; i<a.length;i++)  //01  12  23
		{
			if(a[i+1]>a[i])       //6>3      3>2   4>2
			{
				temp1=a[i+1];     //temp1=6      temp=2
				a[i+1]=a[i];      //a[1]=3       a[2]=3
				a[i]=temp1;     //a[0]=6         a[1]=2
			}
		}
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] +" ");
		}
	}

}
