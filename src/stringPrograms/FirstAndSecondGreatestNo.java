package stringPrograms;

public class FirstAndSecondGreatestNo {
    
	public static void main(String[] args) {
	

		int []  a = {5,4,6,3,2,1,7};
		int first=0;
		int second =0;
		
		for(int i=0; i<a.length; i++)
		{
			
			if(a[i]>first)
			{
				
				second=first;
				first= a[i];
			}
		}
		System.out.println(first);
		System.out.println(second);
}
	
	
}
