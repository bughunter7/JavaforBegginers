package level1oops_stateofanobject;

public class BikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instance Variable called speed is created and using same variable we are setting 
		// different values for it 

		Bike ducati=new Bike();
		Bike honda=new Bike();
		
		ducati.speed=100;
		honda.speed=80;
		
		honda.speed=400;
		System.out.println(ducati.speed);

		System.out.println(honda.speed);
		
	}

}
