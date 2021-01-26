package level1_charExercise;

public class charEx1 {

	private char ch; // PS : not an optimised code but enough to understand char concepts 
	
	public void setchar(char vow)
	{
		this.ch=vow;
	}
	
	public void isvowel()
	{
		if (ch=='a' || ch=='e'|| ch=='i'||ch=='o'|| ch=='u') {
			
			System.out.println("Entered alphabet is a vowel");
		}
		else
		{
			System.out.println("Entered alphabet is a consonant");
		}
		
		
	}
	
	public void isdigit()
	{
		if (ch>=48 && ch<=57) {
			System.out.println("Entered character is a Digit");
		}
		else
		{
			System.out.println("Entered character is not a Digit");
		}
	}
}
