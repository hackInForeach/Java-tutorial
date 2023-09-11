import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

//		HashMap implements the Map interface (need import)
//		HashMap is similar to ArrayList, but with key-value pairs
//		stores objects,, need to use Encapsulation 
//		ex: (name, email),(username, userID),(country, capital)
//		

		HashMap<String, String> countries = new HashMap<String, String>();

		// add a key and value

		countries.put("Turkiye", "Ankara");
		countries.put("Turk", "Samsun");
		countries.put("Russia", "Moscow");
		countries.put("India", "New Delhi");
		countries.put("China", "Beijing");

		// System.out.println(countries);

//		countries.remove("China");
//		System.out.println(countries);
//		System.out.println(countries.get("Russia"));

//		countries.clear();
//		System.out.println(countries);
//		countries.replace("India", "Detroid");

//		System.out.println(countries.get("India"));

//		System.out.println(countries.containsKey("England"));
		
//		System.out.println(countries.containsValue("Beijing"));
	
		
		for(String country : countries.keySet()) {
			System.out.print(country+"\t"+"= ");
			System.out.println(countries.get(country));
		}
		
		
	}

}
