import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrameLamda extends JFrame {

	JButton button;
	JLabel label;
	
	MyFrameLamda(){
		ImageIcon icon = new ImageIcon("point.png");
		ImageIcon icon2 = new ImageIcon("face.png");
		
		label=new JLabel();
		label.setIcon(icon2);
		label.setBounds(175,250,150,150);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(100,100,250,150);
		button.setText("I'm a button.");
		button.setFocusable(false);
		
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
		button.setIconTextGap(-5);
		button.setForeground(Color.cyan);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		
		button.addActionListener(e -> System.out.println("poo"));
	//	button.addActionListener(e -> button.setEnabled(false));
		button.addActionListener(e -> label.setVisible(true));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}
}
