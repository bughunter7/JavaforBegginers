package leveloops_basicsofencapsulation_settersandgetters;

public class Bike {

	private int speed;
	
	public void setspeed(int speed)
	{
		if (speed>0) {
			this.speed=speed;
		}
		
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
		setspeed(this.speed=this.speed-howmuch);
	}
}
