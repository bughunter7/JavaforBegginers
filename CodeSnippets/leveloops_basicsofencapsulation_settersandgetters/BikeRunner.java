package leveloops_basicsofencapsulation_settersandgetters;

public class BikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// made the speed variable private and created setters and getters to the set value into variables 
		
		// Getters and setters can be created using Source -> Create Getters and setters.

		Bike ducati=new Bike();
		Bike honda=new Bike();
		
		
		
		
		
		
		ducati.setspeed(100);
		
		ducati.increasespeed(400);
		
		honda.setspeed(400);
		honda.increasespeed(200);
		
		honda.decreasespeed(700);
		
		System.out.println(ducati.getspeed());
		System.out.println(honda.getspeed());
		
		
		
		
	}

}
