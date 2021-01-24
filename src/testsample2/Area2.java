package testsample2;

import java.util.Scanner;

public class Area2 extends Area1{
	
	
	
	 public void areaoftriangle(int x, int y) {
	      double areaoftrianlge = 0.5 * x * y;
	      System.out.println("Area of Triangle "+areaoftrianlge);
	   }

	 public static void main(String args[]) {
	    
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.println("Enter the length");
		 int a=scan.nextInt();
		 
		 System.out.println("Enter the breadth");
		 int b=scan.nextInt();
		 
		 
	      Area1 obj = new Area1();
	      obj.areaofrec(a, b);
	      
	      
	      Area2 obj2=new Area2();
	      
	      obj2.areaoftriangle(a, b);
	      
	      
	     
	   }

	
}
