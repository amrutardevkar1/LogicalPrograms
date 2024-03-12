package stringPrograms;

public class StringPrintWordWise {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		String string = "Instagram is awesome application";
		
		String[] stringArray = string.split(" ");
		 int max =0;
		 
		 for(String s : stringArray)
		 {
			 int l = s.length();
			 if(l > max)
			 {
				 max=l;
			 }
		 }
		 
		 for(String s: stringArray)
		 {
			 //System.out.println(s);
			 
			 char [] charArray = s.toCharArray();
			 
			 int n= charArray.length;
			 
			 int count=0;
			 for(int i =0; i<(max-n); i++)
			 {
				 System.out.print(" ");
			 }
			 for(int i= (max-n) ; i<max; i++)
			 {
				 
				 System.out.print(charArray[count]);
				 count++;
			 }
				System.out.println();
			
			 
		 }
		
		 
	}
	


}
