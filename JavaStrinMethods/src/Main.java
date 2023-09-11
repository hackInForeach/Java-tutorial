
public class Main {

	public static void main(String[] args) {
		/*
		 * String = a reference data type that can store one or more characters
		 * 			reference data types have access to useful methods
		 */
		
		String name ="Dogukan";
		String name1 ="";
		String name2 ="         Dogukan               ";
		
		boolean result =name.equals("Dogukan");//boolean case sensitive
		boolean result1 =name.equalsIgnoreCase("DoGuKaN");// boolean not case sensitive
		
		int result2 = name.length();// string length
		
		char result3=name.charAt(0);// string index
		
		int result4=name.indexOf("n");//search index
		
		boolean result5=name1.isBlank();// Empty???
		
		String result6=name.toLowerCase();// lower case
		String result7=name.toUpperCase();// upper case
		String result8=name2.trim();// left and right remove space
		String result9=name.replace("an","AN");//string replace and character
		
		System.out.println(result9);
		
		System.out.println(result6+" "+result7);
		
		
	
	}	

}
