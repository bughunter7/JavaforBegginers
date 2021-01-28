package level1_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println(a.length);

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

		double values[] = new double[5];

		System.out.println(values[2]);

		System.out.println(Arrays.toString(values));

		for (int test : a) {
			System.out.println(test);
		}

		Arrays.fill(values, 100);

		System.out.println(Arrays.toString(values));

		int b[] = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println(Arrays.equals(a, b));

		int sorty[] = { 6, 67, 4, 5, 6, 2 };

		Arrays.sort(sorty); // positioning sorting.
		
		System.out.println(Arrays.toString(sorty));
		
		
		
		
		
		
		
		

	}

}
