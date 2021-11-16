package arrayPractice;

public class ArrayPractice01 {
	

	public static void main(String[] args) {


		String [] name = new String [4];
		name[0] = "Amruta";
		name[1] = "Pratima";
		name[2] = "Supriya";
		name[3] = "Kajal";

		byte [] age = new byte[4];
		age[0] = 28;
		age[1] = 27;
		age[2] = 26;
		age[3] = 29;

		for(int i=0; i<4; i++)
		{
			System.out.println("Name= " + name[i] + " " + " & age= " + age[i]);
		}

	}
}


