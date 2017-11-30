import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SwingLogin 
{
	public static void main(String args[])
	{
		JFrame f = new JFrame("First Swing Example");
		f.setSize(350, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();
		f.add(p);

		placeComponents(p);
		f.setVisible(true);
	} 
	

	private static void placeComponents(JPanel p) 
	{
		p.setLayout(null);

		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10,20,80,25);
		p.add(userLabel);


		JTextField userText = new JTextField(20);
		userText.setBounds(100,20,165,25);
		p.add(userText);

		JLabel passwordLabel = new JLabel("\nPassword");
		passwordLabel.setBounds(10,20,80,25);
		p.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100,50,165,25);
		p.add(passwordText);

		JButton loginButton = new JButton("LOGIN");
		loginButton.setBounds(10,80,80,25);
		p.add(loginButton);
	}
}
