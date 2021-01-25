package level1;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print the text
		System.out.println("Hello World");
		
		//print the num
		System.out.println(5*3);
		
		//print the calculated num
		int a=5*3;
		
		System.out.println(a);
		
		//print the multiplication of 5
		
		for (int i = 1; i <=10; i++) {
			
			int num=5*i;
			
			System.out.println(num);
		}
		
		// Escape Character
		
		System.out.println("\"THE\" FIGHTER");
		
		// New line character
		System.out.println("Hello \nworld");
		
		//tab character
		
		System.out.println("Hello \t world");
		
		// slash character
		
		System.out.println("Hello \\ world");
		System.out.println("Hello \\\\ world");
		
		// inbuild methods used in java 
		
		double rand=Math.random(); // does not expect any parameters ...used to generate random value .
		// Datatype Double 
		
		System.out.println(rand);
		
		int minimumnum=Math.min(25, 60);  // method finds out minimum value 
		System.out.println(minimumnum);
		
		int max=Math.max(60, 70); // method finds out maximum value
		System.out.println(max);
		
		// Advanced printing 
		
		System.out.printf("%d + %d + %d = %d",5,6,7,18).println();
		
		//print f is used to formatting of the output 
		
		// %d is for integer ....%s is for string.....%f is for float
		
		System.out.printf("%f , %f , %f  , %f",5.5,6.5,7.5,18.5).println();
		
		
		
	}

}
