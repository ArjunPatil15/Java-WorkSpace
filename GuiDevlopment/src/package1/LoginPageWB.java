package package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPageWB {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPageWB window = new LoginPageWB();
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
	public LoginPageWB() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\arjun\\OneDrive\\Desktop\\GDG\\Sinhgad Institutes_Black.png"));
		frame.setTitle("Login Page");
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int x = (int)dim.getWidth();
		int y = (int)dim.getHeight();
		
		
		frame.setSize(x/2,y/2);
		frame.setLocationRelativeTo(null);
		
//		frame.setBounds(100, 100, 450, 300);
		
		frame.setResizable(false);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Page");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(99, 24, 503, 57);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login Name :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(22, 136, 182, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(22, 224, 182, 43);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(236, 142, 422, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordField_1.setBounds(236, 224, 422, 43);
		frame.getContentPane().add(passwordField_1);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(510, 312, 148, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField_1.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(279, 312, 148, 49);
		frame.getContentPane().add(btnReset);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String loginName = textField.getText();
				String password = passwordField_1.getText();
				
				String[] myArray = new String[1];
				myArray[0] = loginName;
				
				if(loginName.equalsIgnoreCase("Arjun") && password.equals("patil")) {
					WelcomeFrame.main(myArray);
					frame.setVisible(false);
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogin.setBounds(56, 312, 148, 49);
		frame.getContentPane().add(btnLogin);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(62, 100, 636, 26);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(62, 295, 636, 26);
		frame.getContentPane().add(separator_1);
	}
}
