package practice02;

public class FindCountOfEachLetter {
	
	public static void main(String[] args) {
		
		String s = "committee";
		char [] a = s.toCharArray();
	    int count=1;
	    int n = a.length;
	  //  char temp = a[0];
	 
	    for(int j=0; j<n; j++)
	    {
	    for(int i=j+1; i<n; i++)
	    {
	    	if(a[j]==a[i])
	    	{
	    		count++;
	    		a[i]='0';
	    	}
	    	
	    }
	    
	    if(a[j]!='0')
	    {
	    	 System.out.println(a[j] +" occures " +count + "times");
	    	 count=1;
	    }
	   
	    
	}
	}
}
