
public class Main {

	public static void main(String[] args) {
		// method = a block of code that is executed whenever it is called upon

		String name = "Dogukan";
		int age = 27;
		
		//overload
		hello();
		hello(name);
		hello(name, age);
		
		System.out.println("");

		int x = 3, y = 4;
		int z = add(x, y);
		System.out.println(z);
	}

	static void hello() {
		System.out.println("Hello");
	}

	static void hello(String name) {
		System.out.println("Hello " + name);
	}

	static void hello(String name, int age) {
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old");
	}

	static int add(int x, int y) {
		int z = x + y;
		return z;
	}

}
