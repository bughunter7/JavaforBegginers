package level1_Datatypes;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Byte.SIZE);
		System.out.println(Byte.BYTES);

		System.out.println(Byte.MAX_VALUE + " " + Byte.MIN_VALUE);

		long l = 5000000000l;

		// Wrapper class for other data-types are long , integer , short .

		int i = (int) l; // Explicit Conversion

		System.out.println(i);

		l = i; // implicit conversion

		System.out.println(l);

		char ch = '\u00A2';

		System.out.println(ch);

	}

}
