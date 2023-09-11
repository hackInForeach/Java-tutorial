
public class Main {

	public static void main(String[] args) {
		// Encapsulation = attributes of a class will be hidden or private,
		//				   Can be accessed only through methods (getter & setter)
		//				   You should make attributes private if you don't have a reason to make them public/protected

		
		Car car=new Car("Chevrolet","Camaro",2021);
		
//		System.out.println(car.getMake());
//		System.out.println(car.getModel());
//		System.out.println(car.getYear());
		
		car.setYear(2022);
		car.setMake("Chevrolet V2");
		car.setModel("Camaro V2");

		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());

		
		
	}
	

}
