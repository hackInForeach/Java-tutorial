import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
// while loop = executes a block of code as long as a it's condition remains true 

		
		Scanner input = new Scanner(System.in);
		String name = "";
		
		// runs until the condition is false
		while (name.isBlank()) {
			System.out.print("Enter your name: ");
			name=input.nextLine();
			
		}
		
		System.out.println("Hello "+name);
	
		
		// works at least once even if the expression is false
		do {
			
			System.out.print("2 Enter your name: ");
			name=input.nextLine();
			
			
		} while (name.isBlank());
		System.out.println("2 Hello "+name);
	}

}
