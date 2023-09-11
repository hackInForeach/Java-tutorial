import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {

			FileWriter writer = new FileWriter("poem.txt",true);	
			//writer.write("Roses are red \nVilets are blue \nBooty booty booty booty \nRochin' everywhere!");
			writer.append("\n(A poem by Dogukan)");
			writer.close();
		} catch (IOException exception) {
			exception.printStackTrace();
		}

	}

}
