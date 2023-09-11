
import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {
	
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0,1000);
	ProgressBarDemo(){
		
		bar.setValue(0);
		bar.setBounds(0,0,485,50);
		bar.setStringPainted(true);
		bar.setFont(new Font("Console",Font.BOLD,25));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
		
	}
	public void fill() {
		
		int counter = 1000;
		while(counter>=1){
			bar.setValue(counter);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			counter--;
		}
		bar.setString("Done! 😀");
	}
}
