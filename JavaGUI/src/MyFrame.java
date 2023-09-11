import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	MyFrame(){
		// this = a GUI window to add components to
		//JFrame jFrame= new JFrame(); // creates a frame
		this.setTitle("this title goes here"); // sets title name
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);// exit out of application
		this.setResizable(false);// prevent frame from being resized
		this.setSize(640,420); // sets the x-dimension, and y-dimension of frame
		this.setVisible(true); //make frame visible

		
		ImageIcon image= new ImageIcon("logo.png");// create an ImageIcon
		this.setIconImage(image.getImage());//change icon of frame
		
		this.getContentPane().setBackground(new Color(0,0,0,150));//change color background
	
	}
}
