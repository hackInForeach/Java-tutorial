import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
		//JPanel = a GUI component that functions as a container to hold other components
		
		ImageIcon icon= new ImageIcon("thumbsub.png");
		
		
		JLabel jLabel= new JLabel();
		jLabel.setText("Hi");
		jLabel.setIcon(icon);
//		jLabel.setVerticalAlignment(JLabel.BOTTOM);
//		jLabel.setHorizontalAlignment(JLabel.RIGHT);
		//
		jLabel.setBounds(75,75,75,75);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0,0,250,250);
//		redPanel.setLayout(new BorderLayout());
		redPanel.setLayout(null);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250,0,250,250);
//		bluePanel.setLayout(new BorderLayout());
		bluePanel.setLayout(null);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0,250,500,250);
//		greenPanel.setLayout(new BorderLayout());
		greenPanel.setLayout(null);
		
		JFrame jFrame = new JFrame();
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		jFrame.setLayout(null);
		jFrame.setSize(750,750);
		jFrame.setVisible(true);
		redPanel.add(jLabel);
	//	bluePanel.add(jLabel);
	//	greenPanel.add(jLabel);
		jFrame.add(redPanel);
		jFrame.add(bluePanel);
		jFrame.add(greenPanel);
		
	}

}
