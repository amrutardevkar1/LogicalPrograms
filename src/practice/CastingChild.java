package practice;

public class CastingChild extends Casting{
	
	public void m1()
	{
		System.out.println("child m1 running");
	}
	
	public void m2()
	{
		System.out.println("child m2 running");
	}

	public void m4()
	{
		System.out.println("child m4 running");
	}
	
	public void m5()
	{
		System.out.println("m5 running");
	}
	
	public static void main(String[] args) {
		
		Casting k = new CastingChild();
		CastingChild m = (CastingChild)k;
		
		m.m1();
		m.m2();
		m.m3();
		m.m4();
		m.m5();
		m.m6();
		
	}
}
