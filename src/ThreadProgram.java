
public class ThreadProgram  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		SecondThread t1 = new SecondThread();
		//ThreadProgram t2 = new ThreadProgram();
		
		t1.start();
		Thread.sleep(4000);
	 //   t2.start();
        int n = 1;
		
		while(true)
		{
			System.out.println(n++ + "main thread");
		}
		

	}
}

class SecondThread extends Thread
{
	int n =1;
	
	public void run()
	{
		
		
		while(true)
		{
			System.out.println(n++ +"t1 thread");
		}
		
	}

}
