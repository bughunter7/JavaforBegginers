package level1oops_constructors;

public class BikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// made the speed variable private and created setters and getters to the set value into variables 
		
		// Getters and setters can be created using Source -> Create Getters and setters.

		Bike ducati=new Bike(100);
		Bike honda=new Bike(100);
		
		
		Bike newbike=new Bike();
		
		ducati.increasespeed(400);
		
		
		honda.increasespeed(200);
		
		honda.decreasespeed(100);
		
		System.out.println(ducati.getspeed());
		System.out.println(honda.getspeed());
		
		System.out.println(newbike.getspeed());
		
		
		
	}

}
