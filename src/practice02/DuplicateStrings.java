package practice02;

public class DuplicateStrings {
	
	public static void main(String[] args) {
		
		String [] s = { "man", "cat", "bat", "man","dog", "cat","god", "bat"};
		 int n = s.length;
		 for(int i =0; i<n; i++)
		 {
			 for(int j=i+1; j<n; j++)
			 {
			       int result = s[i].compareTo(s[j]);
			       
			       if(result ==0 && s[i]!="0")
			       {
			    	   System.out.println("duplicate is= " + s[i]);
			    	   s[j]="0";
			       }
			 }
		 }
		
		
	}

}
