
public class Pizza {

	String bread;
	String souce;
	String cheese;
	String topping;

	Pizza() {

	}

	Pizza(String bread) {

		this.bread = bread;
	}

	Pizza(String bread, String souce) {

		this.bread = bread;
		this.souce = souce;
	}

	Pizza(String bread, String souce, String cheese) {

		this.bread = bread;
		this.souce = souce;
		this.cheese = cheese;

	}

	Pizza(String bread, String souce, String cheese, String topping) {

		this.bread = bread;
		this.souce = souce;
		this.cheese = cheese;
		this.topping = topping;

	}
}
