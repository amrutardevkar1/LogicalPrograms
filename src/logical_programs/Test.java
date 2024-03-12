package logical_programs;

public class Test {

	
	public static void main(String[] args) {
		
		String s = "This is a demo of the getChars method.";
		String s2 = "This is amruta";
		String s3 = "Amruta is my name and engineer is my profession";
		
		 int start = 10;
		 int end = 14;
		 char buf[] = new char[10];
		 buf[8]= 'm';
		 s.getChars(start, end, buf, 2);
		 System.out.println(buf);
		
		 
		boolean r = s.regionMatches(false, 0, s2, 0, 4);
		System.out.println(r);
		System.out.println(s.replaceAll("is", "was"));
		String [] d= s3.split(" ", 0);
		for(int i=0; i<9; i++)
		{
		System.out.println(d[i]);
		}
		
		execRuntime();
		
	}
	
	public static void execRuntime()
	{
		Runtime r = Runtime.getRuntime();
		Process p= null;
		
		try
		{
			p= r.exec("C:\\Users\\Amruta\\eclipse-workspace\\chromedriver-win64\\chromedriver.exe");
			p= r.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		}
		 catch (Exception e) {
			 System.out.println(e.getMessage());
			 }
	}

}
