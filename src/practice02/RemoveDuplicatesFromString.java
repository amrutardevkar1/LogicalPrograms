package practice02;

public class RemoveDuplicatesFromString {
	
	public static void main(String[] args) {
		
		String s = "my name is not khan my name is amruta";
		String [] a = s.split(" ");
		StringBuilder m = new StringBuilder();
		int n = a.length;
		
		for (int i =0; i<n ; i++)
		{
			for(int j=i+1; j<n ;j++)
			{
				if(a[i].equals(a[j]))
				{
					a[j]="null";
				}
				
			}
			
			if(!a[i].equals("null"))
			{
			   System.out.print(a[i] + " ");
			}
		}
	}

}
