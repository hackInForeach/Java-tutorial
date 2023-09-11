import java.io.FileReader;
import java.io.IOException;
public class Main {

	public static void main(String[] args) {
		// FileRaeder = read the contents of file as a stream of characters.
		//				read() returns an int value which contains the byte value
		//				when read() returns -1, there is no more data to be read
		
		try {
			FileReader reader= new FileReader("art.txt");
			int data =  reader.read();
			while(data != -1) {
				System.out.print((char)data);
				data =  reader.read();
			}
			reader.close();
		}catch(IOException exception) {
			exception.printStackTrace();
		}
		
	}

}
