import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

//	generics = enable types (classes and interfaces) to be parameters when defining:	
//		       classes, interfaces and methods a benefit is to eliminate the need to
//			   create multiple versions of methods or classes for various data types.
//			   Use 1 version for all reference data types

//		Integer[] intArray = { 1, 2, 3, 4, 5 };
//		Double[] doubleArray = { 5.5, 4.4, 3.3, 2.2, 1.1 };
//		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
//		String[] stringArray = { "B", "Y", "E" };

//		displayArray(intArray);
//		displayArray(doubleArray);
//		displayArray(charArray);
//		displayArray(stringArray);

//		System.out.print(getFirst(intArray));
//		System.out.print(getFirst(doubleArray));
//		System.out.print(getFirst(charArray));
//		System.out.print(getFirst(stringArray));

		/*
		 * //classes MyIntegerClass myInt = new MyIntegerClass(1); MyDoubleClass
		 * myDouble = new MyDoubleClass(3.14); MyCharacterClass myChar = new
		 * MyCharacterClass('@'); MyStringClass myString = new MyStringClass("Hello");
		 */

		// generic class
		
		
//	bounded types = you can create the objects of a generic class to have data	
//				    of specific derived types ex.number
//		
		
		MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1,2);
		MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.14,5.2);
		//MyGenericClass<Character, Character> myChar = new MyGenericClass<>('@','?');
		//MyGenericClass<String, String> myString = new MyGenericClass<>("Hello","Wordl");

		ArrayList<String> myFriend = new ArrayList<>();

		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		//System.out.println(myChar.getValue());
		//System.out.println(myString.getValue());

	}

	public static <Thing> Thing getFirst(Thing[] array) {
		
		
		return array[0];
	}

	public static <Thing> void displayArray(Thing[] array) {
		for (Thing x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	/*
	 * public static void displayArray(Integer[] array) { for (Integer x: array) {
	 * System.out.print(x+" "); } System.out.println(); }
	 * 
	 * public static void displayArray(Double[] array) { for (Double x: array) {
	 * System.out.print(x+" "); } System.out.println(); } public static void
	 * displayArray(Character[] array) { for (Character x: array) {
	 * System.out.print(x+" "); } System.out.println(); } public static void
	 * displayArray(String[] array) { for (String x: array) {
	 * System.out.print(x+" "); } System.out.println(); }
	 */

}
