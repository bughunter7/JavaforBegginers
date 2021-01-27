package level1_Datatypes;

import java.util.Scanner;

public class FindPrimeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number");
		
		
		Scanner obj=new Scanner(System.in);
		
		int a=obj.nextInt();
		
		for (int i = 1; i<=100 ; i++) {
			
			if (a%2==0) {
				
				System.out.println("its a prime no");
				break;
			}
			else
			{
				System.out.println("its not a prime no");
				break;
			}
		}

	}

}
