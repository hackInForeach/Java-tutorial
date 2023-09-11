
public class Main {

	public static void main(String[] args) {

		double x = 3.54;
		double y = -10.5;
		
		double z = Math.max(x,y);
		double z1 = Math.min(x,y);
		
		//mutlak
		double z2= Math.abs(y);
		
		//kara kök
		double z3 = Math.sqrt(z2);
		
		//yuvarlama
		double z4 = Math.round(z3);
		
		//aşağıya yuvarla
		double z5 = Math.floor(z3);
		
		System.out.println(z4);
		

	}

}
