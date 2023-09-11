import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// exception = an event that occurs during the execution of a program that
		//             disrupts the normal flow of instructions
			Scanner input = new Scanner(System.in);
		try {
			
		
			System.out.println("Enter a whole number to divide: ");
			int x= input.nextInt();
			System.out.println("Enter a whole number to divide by: ");
			int y= input.nextInt();
		
			int z = x/y;
			System.out.println("Result: "+z);
		} catch (ArithmeticException exception) {
			System.out.print("You can't divide by zero! IDIOT! =>>> ");
			System.out.println("Error: "+exception.getMessage());
			
		} catch(InputMismatchException exception) {

			System.out.print("PLEASE ENTER A NUMBER OMFG!!! =>>> ");
			System.out.println("Error: "+exception.getMessage());
		} catch(Exception exception) {
			System.out.print("Something went wrong!! =>>> ");
			System.out.println("Error: "+exception.getMessage());
		} finally {
			System.out.println("This will always print");
			input.close();
		}
		
		
	}

}
