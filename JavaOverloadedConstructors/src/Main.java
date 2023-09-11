
public class Main {

	public static void main(String[] args) {
		// overloaded constructors = multiple constructor within a class with the same
		// name,
		// but have different parameters
		// name + parameters = signature

		Pizza pizza = new Pizza();
		
		Pizza pizza2 = new Pizza("thicc crust");
		
		Pizza pizza3 = new Pizza("thicc crust", "tomato");
		
		Pizza pizza4 = new Pizza("thicc crust", "tomato", "mozzerella");
		
		Pizza pizza5 = new Pizza("thicc crust", "tomato", "mozzerella", "peperoni");
		
		System.out.println("Here are the ingredients of your pizza:  ");
		System.out.println(pizza.bread);
		System.out.println(pizza.souce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);

	}

}
