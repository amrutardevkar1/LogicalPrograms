package stringPrograms;

public class StringMethodsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Amruta is my name, Amruta is beautiful name ";
		
		//System.out.println(str.repeat(3));
		StringBuilder sb = new StringBuilder();
		String[] s = str.split(" ");
		for(int i=s.length-1; i>=0; i--)
		{
			sb.append(s[i] + " ");
		}
		
		System.out.println(sb);
	
		StringBuffer sb2 = new StringBuffer();
	for(int i=0; i<s.length; i++)
	{
		for(int j= i+1; j<s.length; j++)
		{ 
			if(s[i].compareTo(s[j])<=0)
			{
				String temp = s[i];
				s[i] = s[j];
				s[j] = temp;
			}
		}
		
		sb2.append(s[i] + " ");
	}
	
	System.out.println(sb2);
	
	}
}
