
public class Main {

	public static void main(String[] args) {
		// overloaded = methods that share the same name but have different parameters
		// method name + parameters = method signature

		int x = 2, y = 3, z = 1, t = 2;
		double x1 = 2.3, y1 = 3.1, z1 = 1.5, t1 = 2.6;

		System.out.println(add(x, y));
		System.out.println(add(x, y, z));
		System.out.println(add(x, z, y, t));

		System.out.println(add(x1, y1));
		System.out.println(add(x1, y1, z1));
		System.out.println(add(x1, z1, y1, t1));

	}

	static int add(int a, int b) {
		System.out.println("This is overloaded methot #1");
		return a + b;
	}

	static int add(int a, int b, int c) {
		System.out.println("This is overloaded methot #2");
		return a + b + c;
	}

	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded methot #3");
		return a + b + c + d;
	}

	static double add(double a, double b) {
		System.out.println("This is overloaded methot #4");
		return a + b;
	}

	static double add(double a, double b, double c) {
		System.out.println("This is overloaded methot #5");
		return a + b + c;
	}

	static double add(double a, double b, double c, double d) {
		System.out.println("This is overloaded methot #6");
		return a + b + c + d;
	}

}
