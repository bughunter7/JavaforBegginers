package level1oops_createinstance;

public class BooksRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// books name are the instances of the class ( objects )
		

		Books Artofprogramming=new Books();
		
		Books Effectivejava=new Books();
		
		Books Cleancode=new Books();
		
		Artofprogramming.readbooks();
		
		Effectivejava.readbooks();
		
		Cleancode.readbooks();
		
	}

}
