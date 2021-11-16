package arrayPractice;

import java.util.Arrays;

public class ArrayPractice03 {

	public static void main(String[] args) {

		int [] rank = {5, 4, 1, 2,3};

		Arrays.sort(rank);

		System.out.println("Ranks in ascending order: " );

		for(int a: rank) {
			System.out.println(a);
		}


		System.out.println("Ranks in descending order: ");
		for(int i = rank.length-1; i>=0; i--)
		{

			System.out.println(rank[i]);
		}
	}

}
