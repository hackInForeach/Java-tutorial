import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener{
	
	JLabel label;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		
		label = new JLabel();
		label.setBounds(1,1,100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		//label.addMouseListener(this);
		
		this.addMouseListener(this);
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// invoked when the mouse button has been clicked 
		// (pressed and released) on a component
		
		System.out.println("You clicked the mouse \"mouseClicked\"");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// invoked when a mouse button has been pressed on a component
		System.out.println("You Pressed the mouse \"mousePressed\"");
		label.setBackground(Color.yellow);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// invoked when a mouse button has been released on a component
		System.out.println("You Released the mouse \"mouseReleased\"");
		label.setBackground(Color.green);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// invoked when the mouse enters a component
		System.out.println("You Entered the mouse \"mouseEntered\"");
		label.setBackground(Color.blue);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// invoked when the mouse exits a component
		System.out.println("You Exited the mouse \"mouseExited\"");
		label.setBackground(Color.red);
	}
}


















