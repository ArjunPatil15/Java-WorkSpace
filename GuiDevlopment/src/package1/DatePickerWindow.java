package package1;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class DatePickerWindow {

	private JFrame frmDatepicker;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatePickerWindow window = new DatePickerWindow();
					window.frmDatepicker.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DatePickerWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDatepicker = new JFrame();
		frmDatepicker.setTitle("DatePicker");
		frmDatepicker.setBounds(100, 100, 803, 597);
		frmDatepicker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDatepicker.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Slect Date :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(119, 136, 273, 66);
		frmDatepicker.getContentPane().add(lblNewLabel);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("dd-MM-yyyy");
		dateChooser.setBounds(360, 143, 323, 46);
		frmDatepicker.getContentPane().add(dateChooser);
		
		JButton btnNewButton = new JButton("Get Date");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				String format = sdf.format(dateChooser.getDate());
				textField.setText(format);
			}
		});
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(102, 326, 247, 60);
		frmDatepicker.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(410, 326, 273, 60);
		frmDatepicker.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
