package Warmup1;

import java.util.Scanner;

public class absolute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Return True if it is between 10 of 100 or 200 
		
		
		System.out.println("Enter the number ");
		
		Scanner obj=new Scanner(System.in);
		
		int a=obj.nextInt();
		
		if (a>90 && a<=100) {
			System.out.println(true);
		}
		else if(a>190 && a<=200)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}

	}

}
