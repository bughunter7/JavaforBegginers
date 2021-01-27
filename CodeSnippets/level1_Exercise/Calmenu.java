package level1_Exercise;

import java.util.Scanner;

public class Calmenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number 1:");

		a = obj.nextInt();

		System.out.println("Enter the number 2:");
		b = obj.nextInt();

		// System.out.println(a+" "+b);

		System.out.println("1-Add \n2-Subtract\n3-Divide\n4-multiply");
		
		System.out.println("Choose Opertaions" );
		int op = obj.nextInt();
		

		if (op == 1) {

			System.out.println(a + b);

		}
		else if(op==2)
		{
			System.out.println(a-b);
		}
		else if(op==3)
		{
			System.out.println(a/b);
		}
		else if(op==4)
		{
			System.out.println(a*b);
		}
		else
		{
			System.out.println("Invalid input");
		}

	}

}
