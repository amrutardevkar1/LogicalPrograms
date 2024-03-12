package practice02;

public class RemoveDuplicateWords {
	
	public static void main(String[] args) {
		
		String s = "i am very very happy today";
		String [] a = s.split(" ");
		int n= a.length;
		
		String temp=a[0];
		for(int i=1; i<= (n-1); i++)
		{
			if(!temp.equals(a[i]))   //1 2 3 4 
			{
				System.out.print(temp + " ");  // 0  1  3 4
				temp=a[i];  //1  2 4 5
			}
			
			else
			{
				
				temp=a[i];     //3 
			}
		}
		System.out.print(temp+" ");
	}

}
