import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener{

	JRadioButton pizzaButton;
	JRadioButton hotdogButton;
	JRadioButton hamburgerButton;
	ButtonGroup buttonGroup;
	ImageIcon pizzaIcon;
	ImageIcon hotdogIcon;
	ImageIcon hamburgerIcon;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaIcon= new ImageIcon("pizza.png");
		hotdogIcon= new ImageIcon("hotdog.png");
		hamburgerIcon= new ImageIcon("hamburger.png");
		
		pizzaButton = new JRadioButton();
		pizzaButton.setText("Pizza");
		
		hotdogButton = new JRadioButton();
		hotdogButton.setText("Hotdog");
		
		hamburgerButton = new JRadioButton();
		hamburgerButton.setText("Hamburger");
		
		buttonGroup = new ButtonGroup();
		buttonGroup.add(hamburgerButton);
		buttonGroup.add(hotdogButton);
		buttonGroup.add(pizzaButton);
		
		pizzaButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		
		pizzaButton.setIcon(pizzaIcon);
		hamburgerButton.setIcon(hamburgerIcon);
		hotdogButton.setIcon(hotdogIcon);
		
		this.add(hamburgerButton);
		this.add(hotdogButton);
		this.add(pizzaButton);
		this.pack();
		this.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==pizzaButton) {
			System.out.println("You order a Pizza");
			
		}else if(e.getSource()==hotdogButton) {
			System.out.println("You order a Hotdog");
			
		}else if(e.getSource()==hamburgerButton) {
			System.out.println("You order a Hamburger");
		}
		
	}
	
}
