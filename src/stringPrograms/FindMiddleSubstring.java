package stringPrograms;

public class FindMiddleSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abscandysbs";
		int n= s.length();
		System.out.println(n);
		int start = (n/2)-3;
		int end = (n/2)+4;
		String sub = s.substring(start, end);
		System.out.println(sub);
		

	}

}
