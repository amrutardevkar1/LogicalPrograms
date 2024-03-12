package stringPrograms;

public class DeciperNumber {
	
	public static void main(String[] args) {
		
		int num =135;
		int num2= num;
		int remainder=0;
		int multi=1;
	    int result=0;
	    int count=3;
	    while(num>0)
	    {
	    	
	    	
	    		remainder = num%10;  
	    	
	    		for(int j=count; j>=1;j--)      
	    		{
	    			multi = multi*remainder;        
	    		}
	    		
	    		result= result+multi;    
	    		num= num/10; 
	    		  multi=1;               
	    		count--;               
	    	
	    	
	    }
	    
	    if(result==num2)
	    {
	    	System.out.println("ok" + result);
	    }
	    else
	    {
	    	System.out.println("not ok");
	    }
	}

}
