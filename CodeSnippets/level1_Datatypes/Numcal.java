package level1_Datatypes;

public class Numcal {

	private int a, b;

	public Numcal(int num1, int num2) {
		// TODO Auto-generated constructor stub
		this.a = num1;
		this.b = num2;
	}

	public int getnum1() {
		return this.a;
	}

	public int getnum2() {
		return this.b;
	}

	public int add() {
		int sum = a + b;
		return sum;
	}

	public int multiply() {
		return a * b;
	}

	public void doublevalue() {
		int num1 = this.a *= 2;
		int num2 = this.b *= 2;

		System.out.println("Double of the Value Entered is "+num1 + " " + num2);
	}

}
