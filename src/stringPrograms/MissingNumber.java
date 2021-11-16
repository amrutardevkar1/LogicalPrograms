package stringPrograms;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		int [] number = {0,1,2,3,4,6,7,8};
		System.out.print("Original array is: ");
		
		for(int i =0; i<number.length; i++)
		{
			System.out.print(number[i]+ " ");
		}
		
			int temp=number[0];
			System.out.println(); 
			
			System.out.print(number[0] + " ");
			
			for(int j =1; j<number.length; j++)
			{
				if(number[j]==temp+1)
				{
					System.out.print(number[j] + " ");
					temp=number[j];
				}
				
				else
				{
					System.out.println();
					System.out.println("Missing number is: " + (temp+1));
					break;
				}
			}
		}
	}


