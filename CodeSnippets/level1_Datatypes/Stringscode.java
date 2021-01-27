package level1_Datatypes;

public class Stringscode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sample = "This is the test string sample";

		System.out.println(sample.charAt(1));
		System.out.println(sample.length());

		System.out.println(sample.indexOf("T"));

		for (int i = 0; i < sample.length(); i++) {

			System.out.println(sample.charAt(i));
		}

		System.out.println(sample.startsWith("This"));
		System.out.println(sample.endsWith("sample"));

		// other methods includes is empty ,equals , equals ignore case.

		String ab = "java ";

		String bc = ab.concat("is awesome !");

		System.out.println(bc);

		System.out.println(bc.toUpperCase()); // tolowercase is opposite.
		
		// Trim methods cuts the space from start and end of the string.
		
		// Note : and many more methods are provided for strings .
		
	
		//String Builder and String Buffer are tow more additional API which are provided for 
		//working with string.
		
		StringBuilder str=new StringBuilder("test");
		
		str.append(" cool");
		
		System.out.println(str);
	
	}

}
