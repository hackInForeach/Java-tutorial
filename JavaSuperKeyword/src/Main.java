
public class Main {

	public static void main(String[] args) {

		// super = keyword refers to the superclass (parent) of an object
		// very similar to the "this" keyword

		Hero hero = new Hero("Batma", 42, "$$$");

//		System.out.println(hero.name);
//		System.out.println(hero.age);
//		System.out.println(hero.power);

		System.out.println((hero.toString()));
		
		System.out.println();
		
		Hero hero2 = new Hero("Superman", 43, "everything");

//		System.out.println(hero2.name);
//		System.out.println(hero2.age);
//		System.out.println(hero2.power);
		
		System.out.println((hero2.toString()));

	}
}
