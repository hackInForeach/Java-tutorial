
public class Main {

	public static void main(String[] args) {
		// inheritance = the process where one class acquires
		//				 the attribute and methods of another

	
		Bicycle bicycle = new Bicycle();
		Car car = new Car();
		
		car.go();
		car.speed=220;
		System.out.println(car.speed);
		bicycle.go();
		bicycle.speed=55;
		System.out.println(bicycle.speed);
		
		System.out.println(car.door);
		System.out.println(bicycle.pedals);
		
		car.stop();
		bicycle.stop();
	}

}
