package myPractice;

public class FirstAndSecondGreaterNumber {
	
	public static void main(String[] args) {
		
		int [] a= {1,2,5,6,7,4,3};
		int temp1=a[0];
		int temp2=0;
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>temp1)
			{
				temp2=temp1;
				temp1=a[i];
			
				a[i]=temp2;
			}
		}
		
		System.out.println("1st highest no= " + temp1);
		System.out.println("2nd highst no= " + temp2);
	}

}
