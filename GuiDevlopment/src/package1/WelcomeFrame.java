package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class WelcomeFrame {

	private JFrame frame;
	
	static String loginName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		loginName = args[0];
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeFrame window = new WelcomeFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WelcomeFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome " + loginName);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(27, 50, 399, 44);
		frame.getContentPane().add(lblNewLabel);
	}

}
