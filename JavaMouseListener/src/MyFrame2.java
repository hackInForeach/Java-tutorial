import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame2 extends JFrame implements MouseListener{
	
	JLabel label;
	ImageIcon smile;
	ImageIcon nervous;
	ImageIcon pain;
	ImageIcon dizzy;
	
	MyFrame2(){
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		label = new JLabel();
		label.addMouseListener(this);
		
		smile = new ImageIcon("smile.png");
		nervous = new ImageIcon("nervous.png");
		pain = new ImageIcon("pain.png");
		dizzy = new ImageIcon("dizzy.png");
		
		label.setIcon(smile);
		
		this.add(label);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// invoked when the mouse button has been clicked 
		// (pressed and released) on a component
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// invoked when a mouse button has been pressed on a component
		label.setIcon(pain);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// invoked when a mouse button has been released on a component
		label.setIcon(dizzy);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// invoked when the mouse enters a component
		label.setIcon(nervous);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// invoked when the mouse exits a component
		label.setIcon(smile);
	}
}
