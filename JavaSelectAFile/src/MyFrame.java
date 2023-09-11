import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {

	JButton button = new JButton();;
	JFileChooser fileChooser = new JFileChooser();

	MyFrame() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		button.setText("Select File");
		button.addActionListener(this);
		button.setFocusable(false);

		this.add(button);
		this.pack();
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			
			fileChooser.setCurrentDirectory(new File("C:/Users/dogus/OneDrive/Masaüstü"));
			
			//int response = fileChooser.showOpenDialog(null);// select file to open
			int response = fileChooser.showSaveDialog(null);// select file to save
			
			if (response == JFileChooser.APPROVE_OPTION){
				
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
			
		}
		
	}
}
