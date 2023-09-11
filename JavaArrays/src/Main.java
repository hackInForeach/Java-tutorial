
public class Main {

	public static void main(String[] args) {

		// array = used to store multiple values in a single variable

	
	
		String[] cars= {"Camaro","Corvette","Tesla","BMW"};
		
	
		cars[0]="Mustang";
		
		
		System.out.println(cars[3]);
		
		System.out.println();
		
		String[] cars1= new String[3];
		cars1[0]="Camaro";
		cars1[1]="Corvette";
		cars1[2]="Tesla";
		
		
		for (int i=0;i<cars1.length;i++) {
			System.out.println(cars1[i]);
		}
		
	}

}










