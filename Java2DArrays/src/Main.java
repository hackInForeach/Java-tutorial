public class Main {

	public static void main(String[] args) {

		// 2D array = an array of arrays

		String[][] cars = { 

							{ "Camaro", "Corvette", "Silverado" }, 
							{ "Tesla", "Mustang", "Ranger" },
							{ "Lambo", "F-150", "Ferrai" } 

						};

		for (int i = 0; i < cars.length; i++) {

			System.out.println();

			for (int j = 0; j < cars[i].length; j++) {
				System.out.print(cars[i][j] + " ");

			}

		}

	}

}
