import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// nested loops = a loop inside of a loop
		
		Scanner input=new Scanner(System.in);
		int rows;
		int colums;
		String symbol="";
		System.out.println("Enter # of rows: ");
		rows=input.nextInt();
		System.out.println("Enter # of colums: ");
		colums=input.nextInt();
		System.out.println("Enter # of symbol: ");
		symbol=input.next();
		
		for (int i = 1; i <=rows; i++) {
			System.out.println();
			for (int j = 1; j <= colums; j++) {
				System.out.print(symbol+" ");
			}
		}
		
	
	
	}

}
