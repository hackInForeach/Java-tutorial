
public class Main {

	public static void main(String[] args) {
		
		//constructor = special method is called when an object is instantiated (created)

		Human human = new Human(
				"Lyne",45,94.3
				);
		Human human2 = new Human(
				"Whick",51,81.3
				);
		
		System.out.println(human2.name+", "+human.name);
		System.out.println();
		human.drink();
		human2.eat();
	}

}
