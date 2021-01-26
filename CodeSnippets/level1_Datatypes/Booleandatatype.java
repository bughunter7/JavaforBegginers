package level1_Datatypes;

public class Booleandatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isvalue=true; 
		
		System.out.println(isvalue);
		
		int i=7;
		
		// Relational operators 
		System.out.println(i<7);
		System.out.println(i==7);

		// Logical operators ( And .......... OR )
		
		int a=100;
		
		System.out.println((a>=20 && a<120));
		
		System.out.println(a<20 || a==100);
		
		System.out.println(true && true);
			
			
		// XOR 
		
		System.out.println(true ^ true);
		
		// not operator
		
		System.out.println(!true);
		
		// Short circuit operator if one operand condition is false it does not executes other operand 
		
		// it only has one & and |
		
		// makes code more readable
		
		int ab=20;
		
		System.out.println(ab>50 & ab>100);
		System.out.println(ab<50 | ab==20);
		
		
		
		
	}

}
