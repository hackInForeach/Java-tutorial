import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
	
	  // Layout Manager = Defines the natural layout for components within a container
	  // FlowLayout =  places components in a row, sized at their preferred size.
	  // 			   if the horizontal space in the container is too small, 
	  //			   the FlowLayout class uses the next available row.
	 
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
	//	frame.setLayout(new FlowLayout(FlowLayout.CENTER));// left right center
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10)); // x y
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100,250));
		panel.setBackground(Color.lightGray);
		panel.setLayout(new FlowLayout());
		
		panel.add(new JButton("1")); //new button
		panel.add(new JButton("2")); //new button
		panel.add(new JButton("3")); //new button
		panel.add(new JButton("4")); //new button
		panel.add(new JButton("5")); //new button
		panel.add(new JButton("6")); //new button
		panel.add(new JButton("7")); //new button
		panel.add(new JButton("8")); //new button
		panel.add(new JButton("9")); //new button
		panel.add(new JButton("0")); //new button
		
		frame.add(panel);
		frame.setVisible(true);
	}

}