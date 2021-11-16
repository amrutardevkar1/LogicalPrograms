package starPatternProgram;

public class LeftPyramid {

	public static void main(String[] args) {
		
		LeftPyramid k = new LeftPyramid();
		k.LeftPyramidPrgm();
	}
	
	public void LeftPyramidPrgm()
	{
		int row=5;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print("* ");
			}
		System.out.println();
		}
	}
}
