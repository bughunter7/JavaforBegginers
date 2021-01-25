package level1;

public class Multiplication3 {

	// Refactoring is a process in which we change the structure of code withour changing the existing functionality 

	public void multiplyrefac(int table) {

		multiplyrefac(table, 5, 10);

	}

	public void multiplyrefac(int table, int from, int to) {
		for (int i = from; i <= to; i++) {

			System.out.println(table * i);
		}

	}

}
