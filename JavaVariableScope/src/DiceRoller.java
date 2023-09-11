import java.util.Random;

public class DiceRoller {
	Random random;
	int number =0;
	
	//local
//	DiceRoller(){
//		Random random=new Random();
//		int number=0;
//		roll(number,random);
//		
//	}
	
	//global
	DiceRoller(){
		
		random=new Random();
		roll();
	}
	
	
	void roll() {
		number= random.nextInt(6)+1;
		System.out.println(number);
	}
}
