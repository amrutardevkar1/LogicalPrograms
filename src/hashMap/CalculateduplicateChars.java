package hashMap;

public class CalculateduplicateChars {
	
	
	public static void main(String[] args) {
		
		String s1 = "my name is amu";
		s1= s1.replaceAll("\\s", "");
		StringBuilder s = new StringBuilder();
		char [] a= s1.toCharArray();
		int count=1;
		
		for(int i =0; i<a.length; i++)
		{  
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j] && a[i]!=0)
				{
					
					count++;
					a[j]=0;
				}
			
				
			}
			if(count>1)
			{
				System.out.println(a[i] + " " + count);
				
			}
			
			count=1;
		}
		
		

	}
	

}
