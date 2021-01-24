package level1;

public class Multiplication1 {

	// TODO Auto-generated method stub
	
	// Methods having same name but different parameters are called method overloading

	void multiply() {

		for (int i = 1; i <= 10; i++) {

			System.out.println(5 * i);
		}
	}

	public void multiply(int table) {

		for (int i = 1; i <= 10; i++) {

			System.out.println(table * i);
		}

	}
	
	public void multiply(int table,int from,int to)
	{
		for (int i = from; i <= to; i++) {

			System.out.println(table * i);
		}

		
	}

}
