import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

// for loop = executes a block of code a limited amount of times

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + ". number");

		}

		System.out.println();

		for (int i = 10; i >= 1; i--) {
			System.out.println(i + ". number");

		}
		System.out.println("Happy nes year!");

		System.out.println();
		for (int i = 10; i >= 0; i -= 2) {
			System.out.println(i + ". number");

		}
		System.out.println();
		for (int i = 10; i >= 0;) {
			System.out.println(i + ". number");
			i-=1;
		}

	}

}
