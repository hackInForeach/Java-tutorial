import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
//		exception = an event, after execution that disrupts the normal flow of the program
//		ex. AritmeeticExceprion, ArrayIndexOutOfBoundsException, FileNotFoundException
//		
//		user defined exceptions = custom exceptions
//		ex.DuplicateEmail, InvalidCreaditException, AgeException
		

	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		try {
			
			checkAge(age);
		
		} catch (Exception e) {
			System.out.println("A problem occured: "+e);
		}
		
	}
	static void checkAge(int age) throws AgeException {
		
		if (age<18) {
			throw new AgeException("\n"+"You most be 18+ to sing up");
		}
		else {
			System.out.println("You are singde up!");
		}
	}

}









