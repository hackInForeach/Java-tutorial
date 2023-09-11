
import java.util.Scanner;
public class Hypotenuse {

	public static void main(String[] args) {
		
		double x,y,z;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x =input.nextDouble();
		System.out.println("Enter side y: ");
		y =input.nextDouble();
		
		z=Math.sqrt((x*x)+(y*y));
		
		System.out.printf("The Hypotenuse Is: %.3fcm",z);
		
		input.close();
		
	}

}
