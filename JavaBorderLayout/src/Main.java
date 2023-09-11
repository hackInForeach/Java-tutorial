import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// layout Manager = Defines the natural layout for components within a container

		// 3 common managers

		// BorderLayout = A BorderLayout places component in five areas: NORTH, SOUTH,
		// WEST, EAST, CENTER.
		// All extra space is placed in the center area.

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout(10, 10));

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();

		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.magenta);
		panel5.setBackground(Color.blue);

		panel1.setPreferredSize(new Dimension(75, 75));
		panel2.setPreferredSize(new Dimension(75, 75));
		panel3.setPreferredSize(new Dimension(75, 75));
		panel4.setPreferredSize(new Dimension(75, 75));
		panel5.setPreferredSize(new Dimension(75, 75));

//-------------------------  sub panels  --------------------
		JPanel panel11 = new JPanel();
		JPanel panel12 = new JPanel();
		JPanel panel13 = new JPanel();
		JPanel panel14 = new JPanel();
		JPanel panel15 = new JPanel();

		panel11.setBackground(Color.black);
		panel12.setBackground(Color.darkGray);
		panel13.setBackground(Color.gray);
		panel14.setBackground(Color.lightGray);
		panel15.setBackground(Color.white);

		panel5.setLayout(new BorderLayout());

		panel11.setPreferredSize(new Dimension(50, 50));
		panel12.setPreferredSize(new Dimension(50, 50));
		panel13.setPreferredSize(new Dimension(50, 50));
		panel14.setPreferredSize(new Dimension(50, 50));
		panel15.setPreferredSize(new Dimension(50, 50));

		panel5.add(panel11, BorderLayout.NORTH);
		panel5.add(panel12, BorderLayout.WEST);
		panel5.add(panel13, BorderLayout.EAST);
		panel5.add(panel14, BorderLayout.SOUTH);
		panel5.add(panel15, BorderLayout.CENTER);
//-------------------------  sub panels  --------------------

		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.WEST);
		frame.add(panel3, BorderLayout.EAST);
		frame.add(panel4, BorderLayout.SOUTH);
		frame.add(panel5, BorderLayout.CENTER);

	}

}
