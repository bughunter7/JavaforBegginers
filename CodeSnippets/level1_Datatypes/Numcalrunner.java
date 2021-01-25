package level1_Datatypes;

public class Numcalrunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Numcal obj=new Numcal(5,10);
		
		System.out.println("Entered Value 1 : "+obj.getnum1());
		System.out.println("Entered Value 2 : "+obj.getnum2());
		
		System.out.println("Sum "+obj.add());
		
		System.out.println();
		
		obj.doublevalue();
	}

}
