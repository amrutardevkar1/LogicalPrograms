package stringPrograms;

public class CountOf9In1to100Nos {
	
	public static void main(String[] args) {
		
		
		int count=0, mod=0, division=0;
		for(int i=1; i<=100; i++)
		{
			mod = i%10;
			division = i/10;
			if((mod==9) || (division==9))
			{
				count++;
			}
		}
		System.out.println("No of 9's in 1 to 100 numbers= " + count);
	}

}
