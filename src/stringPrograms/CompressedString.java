package stringPrograms;

public class CompressedString {

	
	public static void main(String[] args) {
		
		String s= "aaabbcccddefffgghh";
		StringBuilder compressed = new StringBuilder();
		char [] a = s.toCharArray();
		char c= a[0];
		int count=1;
		
		for(int i=1; i<a.length;i++)
		{
			if(c==a[i])
			{
				count++;
			}
			
			else
			{
				compressed.append(c +""+count);
				c=a[i];
				count=1;
			}
			
		}
		
		System.out.println(compressed.append(c+ "" + count));
	}
}