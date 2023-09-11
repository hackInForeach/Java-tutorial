
public class Main {

	public static void main(String[] args) {
/* Lambda expression = feature for JAVA 8 and above also known as an anonymous method
 * 					   a shorter way to write anonymous classes with only one method
 * 					   
 * 					 need to use a functional interface or use a pre-defined functional
 * 					 they contain only one abstract method ex. ActionListener, 
 * 					 Runnable, (user-defined)
 * 
 * 					 A lambda expression can be used in any place where a functional
 * 					 interface is required How to use a lambda expression: 
 * 						(arguments) -> {statement/s}
 */
		/*
		String name = "Dogu";
		char symbol = '!';
		MyInterface  myInterface = (x,y) -> {
			
			System.out.println("Hello World!");
			System.out.println("It's a nıce day, no? "+x+y);
		};
		MyInterface myInterface2 = (x,y) -> {
			System.out.println("Hello "+x +y);
			
		};
		myInterface2.message(name,symbol);
		myInterface.message(name,symbol);
		*/
		
		MyFrame myFrame= new MyFrame();
		
		
	}

}
