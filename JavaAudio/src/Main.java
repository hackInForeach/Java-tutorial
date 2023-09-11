import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

		Scanner input = new Scanner(System.in);

		File file = new File("Level1_up.wav");
		File file1 = new File("Level2_up.wav");
		File file2 = new File("Level3_up.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		String response = "";
		while (!response.equals("Q")) {
			System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
			System.out.print("Enter your choice: ");

			response = input.next();
			response = response.toUpperCase();
			
			switch (response) {
			case "P": 
				clip.start();
				break;
			case "S": 
				clip.stop();
				break;
			case "R": 
				clip.setMicrosecondPosition(0);
				break;
			case "Q": 
				clip.close();
				System.out.println("Byeee");
				break;
//			default:
//				throw new IllegalArgumentException("Unexpected value: " + response);
			}
		}

	}
}
