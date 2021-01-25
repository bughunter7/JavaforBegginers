package level1oops_constructors;

public class Bike {

	private int speed;
	
	public Bike(int speed)
	{
		this.speed=speed;
	}
	
	
	
	public Bike() {
		// TODO Auto-generated constructor stub
		
		this(700); // We can call other constructors by using this keyword.
	}



	public int  getspeed()
	{
		return this.speed;
	}
	
	public void start()
	{
		System.out.println("start");
	}
	
	public void increasespeed(int howmuch)
	{
		this.speed=this.speed+howmuch;
	}
	
	
	public void decreasespeed(int howmuch)
	{
		this.speed=this.speed-howmuch;
	}
}
