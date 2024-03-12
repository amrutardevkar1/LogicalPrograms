package stringPrograms;

public class CountOfEachVowelInString {
	
	public static void main(String[] args) {
		
		String s = "my name is amruta and name of my country is india";
		int [] counters= new int[5];
		char[] chars = s.toCharArray();
		for(char c : chars)
		{
			if(c=='a')
			{
				counters[0]++;
			}
	
			else if(c=='e')
			{
				counters[1]++;
			}
			
			else if(c == 'i')
			{
			 counters[2]++;	
			}
			
			else if(c == 'o')
			{
				counters[3]++;
			}
			
			else if(c == 'u')
			{
				counters[4]++;
			}
			
		
		}
		
		System.out.println("count of vowel a=" + counters[0]);
		System.out.println("count of vowel e=" + counters[1]);
		System.out.println("count of vowel i=" + counters[2]);
		System.out.println("count of vowel o=" + counters[3]);
		System.out.println("count of vowel u=" + counters[4]);
	}

}
