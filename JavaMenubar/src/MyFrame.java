import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
	
public class MyFrame extends JFrame implements ActionListener {
	
	JMenuBar menuBar = new JMenuBar();
	
	JMenu fileMenu = new JMenu();
	JMenu editMenu = new JMenu();
	JMenu helpMenu = new JMenu();
	
	JMenuItem loadItem = new JMenuItem();
	JMenuItem saveItem = new JMenuItem();
	JMenuItem exitItem = new JMenuItem();
	
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		loadIcon = new ImageIcon("load.png");
		saveIcon = new ImageIcon("save.png");
		exitIcon = new ImageIcon("exit.png");
		
		fileMenu.setText("File");
		editMenu.setText("Edit");
		helpMenu.setText("Help");
		
		loadItem.setText("Load");
		saveItem.setText("Save");
		exitItem.setText("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f for load
		editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e for save
		helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h for exit
		
		loadItem.setMnemonic(KeyEvent.VK_L); // l for load
		saveItem.setMnemonic(KeyEvent.VK_S); // S for save
		exitItem.setMnemonic(KeyEvent.VK_E); // E for exit
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		this.setJMenuBar(menuBar);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==loadItem) {
			
			System.out.println("*beep boop you loaded a file*");
		
		}else if (e.getSource()==saveItem) {
			
			System.out.println("*beep boop you saved a file*");
		
		}else if (e.getSource()==exitItem) {
		
			System.out.println("Good by..");
			System.exit(EXIT_ON_CLOSE);
		
		}		
	}
}
