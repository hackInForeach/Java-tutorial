
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("What's your name? : ");
		String name = input.nextLine();
		System.out.print("How old are you?: ");
		int age = input.nextInt();
		input.nextLine();
		System.out.print("What's your favorite food? : ");
		String food = input.nextLine();
		
		System.out.println();
		
		System.out.println("Hello " + name);
		System.out.println("You're " + age + " years old.");
		System.out.println("You're like " + food);

	}

}
