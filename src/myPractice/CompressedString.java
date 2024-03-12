package myPractice;

public class CompressedString {
	
	public static void main(String[] args) {
		
		String s = "aaabbbcdeeefgghjijkklmna";
		StringBuilder sb = new StringBuilder();
		char [] c= s.toCharArray();
		int count=1;
		char ch = c[0];
		
		for(int i=1; i<c.length; i++)
		{
			if(ch==c[i])
			{
				count++;
			}
			
			else
			{
				sb.append(ch+""+count);
				ch=c[i];
				count=1;
			}
		}
		sb.append(ch+""+count);
	 System.out.print(sb);	
	}

}
