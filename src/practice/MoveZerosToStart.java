package practice;

public class MoveZerosToStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] a = {0,0,1,4,0,6,8,0,6,0};
        display(a);
        MoveZerosToStart move= new MoveZerosToStart();
        move.shiftZeroToEnd(a);
        move.shiftZeroToStart(a);
	}
	
	public static void display(int [] b)
	{
		for(int c: b)
		{
			System.out.print(c + " ");
		}
		System.out.println();
	}
	public void shiftZeroToStart(int [] a)
	{
		 
	       int temp=0;
	       for(int i=0; i<a.length; i++)
	       {
	    	   for(int j=i+1; j<a.length; j++)
	    	   {
	    		   if(a[j]==0)
	    		   {
	    			   temp=a[i];
	    			   a[i]=a[j];
	    			   a[j]=temp;
	    		   }
	    	   }
	    	 
	       }
	       
	       display(a);
	}
	
	public void shiftZeroToEnd(int [] a)
	{
	       int temp=0;
	       for(int i=0; i<a.length; i++)
	       {
	    	   for(int j=i+1; j<a.length; j++)
	    	   {
	    		   if(a[i]==0)
	    		   {
	    			   temp=a[i];
	    			   a[i]=a[j];
	    			   a[j]=temp;
	    		   }
	    	   }
	    	 
	       }
	       
	      display(a);
	}

}
