import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyPanel extends JPanel implements ActionListener {

	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	Image enemy;
	Image backgroundImagge;
	Timer timer;
	int xVelocity = 5;
	int yVelocity = 3;
	int x = 0;
	int y = 0;

	MyPanel() {

		this.setPreferredSize(new Dimension(PANEL_HEIGHT, PANEL_WIDTH));
		this.setBackground(Color.black);
		backgroundImagge = new ImageIcon ("space.png").getImage();
		enemy = new ImageIcon("enemy.png").getImage();
		timer = new Timer(1, this);
		timer.start();

	}

	public void paint(Graphics g) {

		super.paint(g); // paint background

		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(backgroundImagge, 0 , 0 , null);
		g2D.drawImage(enemy, x, y, null);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (x >= PANEL_WIDTH-enemy.getWidth(null) || x < 0 ) {
			xVelocity = xVelocity * - 1;
		}
		x = x + xVelocity;
		
		if (y >= PANEL_HEIGHT-enemy.getHeight(null) || y < 0 ) {
			yVelocity = yVelocity * - 1;
		}
		y = y + yVelocity;
		repaint();

	}
	
}



