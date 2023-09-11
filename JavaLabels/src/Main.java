import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		// JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon image2= new ImageIcon("LogoV3.png");
		Border border= BorderFactory.createLineBorder(Color.green,3);
		
		JLabel jLabel= new JLabel();// create a label
		jLabel.setText("Bro, do you even code?"); // set text of label
		jLabel.setIcon(image2);
		jLabel.setHorizontalTextPosition(jLabel.CENTER);// set text LEFTi,CENTER,RIGHT of imaeicon
		jLabel.setVerticalTextPosition(jLabel.TOP);// set text TOP,CENTER,BOTTOM of imageicon
		jLabel.setForeground(new Color(0,255,0,255)); // set font color text
		jLabel.setFont(new Font("MV Boli",Font.PLAIN,30));// set font of text
		jLabel.setIconTextGap(-5);// set gap of text to image
		jLabel.setBackground(Color.BLACK);// set background color
		jLabel.setOpaque(true);// display background color
		jLabel.setBorder(border);
		
		jLabel.setVerticalAlignment(jLabel.CENTER);// set vertical position of icon+text within label
		jLabel.setHorizontalAlignment(jLabel.CENTER);// set horizontal position of icon+text within label
		
		//jLabel.setBounds(100,100,250,250);// set x,y position within frame as well as dimensions
		
		JFrame jFrame= new JFrame(); 
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
//		jFrame.setSize(500,500); 
//		jFrame.setLayout(null);
		jFrame.setVisible(true); 
		jFrame.add(jLabel);
		jFrame.pack();
		
		ImageIcon image1= new ImageIcon("LogoV2.png");
		jFrame.setIconImage(image1.getImage());
		
		
	}

}
