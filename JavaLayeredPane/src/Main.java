import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Main {

	public static void main(String[] args) {
		// JLayeredPane = Swing container that provides a
		//				third dimension for positioning components
		//				ex. depth, Z-index

		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.red);
		label1.setBounds(50,50,200,200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.green);
		label2.setBounds(100,100,200,200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.blue);
		label3.setBounds(150,150,200,200);
		
		JLabel label4 = new JLabel();
		label4.setOpaque(true);
		label4.setBackground(Color.yellow);
		label4.setBounds(200,200,200,200);
		
		JLabel label5 = new JLabel();
		label5.setOpaque(true);
		label5.setBackground(Color.lightGray);
		label5.setBounds(250,250,200,200);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0,0,500,500);
		
		layeredPane.add(label1,JLayeredPane.DEFAULT_LAYER);//Integer.valueOf(0);
		layeredPane.add(label2,JLayeredPane.PALETTE_LAYER);//Integer.valueOf(1);
		layeredPane.add(label3,JLayeredPane.MODAL_LAYER);//Integer.valueOf(2);
		layeredPane.add(label4,JLayeredPane.POPUP_LAYER);//Integer.valueOf(3);
		layeredPane.add(label5,JLayeredPane.DRAG_LAYER);//Integer.valueOf(4);
		
		JFrame frame = new JFrame();
		frame.add(layeredPane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.add(layeredPane);
		frame.setVisible(true);
	}

}
