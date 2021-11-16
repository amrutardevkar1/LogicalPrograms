package practice;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int number =3567;
		int remainder=0;
		int reverse=0;
		
		while(number>0)
		{
			remainder = number%10;
			reverse =  reverse*10 + remainder;
			number = number/10;
		}
		
		System.out.println("reverse of given number is:" + reverse);
	}

}
