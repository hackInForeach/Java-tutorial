import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// JOptionPane = pop up a standard dialog box that prompts users for a value
		// or informs them of something

//		JOptionPane.showMessageDialog(null, "This is some useless info", "MESSAGE", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Here is more useless info :D", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Really??", "QUESTION", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "You're computer has A VIRUS", "WARNING", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Call tech support NOW OR ELSE!!", "ERROR", JOptionPane.ERROR_MESSAGE);

		//System.out.println(JOptionPane.showConfirmDialog(null, "bro, do you  even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION));
//		int answer = JOptionPane.showConfirmDialog(null, "bro, do you  even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
//		
//		String name = JOptionPane.showInputDialog("What is your name?");
//		System.out.println("Your name is : "+name);
		
		String[] responses = {"No, you're awesome!","Thank you!","*blush*"};
		
		ImageIcon icon = new ImageIcon("smile.png");
		JOptionPane.showOptionDialog(
				null, 
				"you are awesome", 
				"Secret Message", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				icon, 
				responses, 
				0);
		
		
	}

}















