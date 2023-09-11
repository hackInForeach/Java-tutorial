import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{

	JButton button = new JButton();
	JLabel label = new JLabel();
	JColorChooser colorChooser= new JColorChooser();
	Color color;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		
		button.setText("Pick a Color");
		button.addActionListener(this);
		button.setFocusable(false);
		
		label.setBackground(Color.white);
		label.setText("This is some text :D");
		label.setFont(new Font("MV Boli",Font.PLAIN,100));
		label.setOpaque(true);
		
		
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			
			color = JColorChooser.showDialog(null, "Pic a Color...I gues", Color.black);
		
			//label.setForeground(color);
			label.setBackground(color);
		}
		
	}

}
