
public class Main {

	public static void main(String[] args) {
		
		
		Garage garage= new Garage();
		Car car1 = new Car("BMW");
		Car car2 = new Car("Mustang");
		Car car3 = new Car("Volvo");
		Car car4 = new Car("Tesla");
		
		garage.park(car1);
		garage.park(car2);
		garage.park(car3);
		garage.park(car4);
		
		
	}

}
