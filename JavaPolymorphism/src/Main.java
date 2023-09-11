
public class Main {

	public static void main(String[] args) {
		// polymorphism = greek word for poly-"many",morph-"from"
		//				  The ability of an object to identity as more than one type
		
		
		
		Car car = new Car();
		Bicycle bicycle=new Bicycle();
		Boat boat = new Boat();

		Vehicle[] racers = {car,bicycle,boat};		

//		car.go();
//		bicycle.go();
//		boat.go();
		
		for (Vehicle race : racers) {
				race.go();
		}		
	
	}
}

